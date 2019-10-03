package com.boc.horoscope.redis.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.time.Duration;


/**
 * Redis缓存配置类
 *
 * @author szekinwin
 */
@Configuration
@EnableCaching
@EnableAutoConfiguration
@PropertySource("classpath:config/redis.properties")
public class RedisConfig extends CachingConfigurerSupport {

    @Value("${redis.host}")
    private String host;
    @Value("${redis.port}")
    private int port;
    @Value("${redis.timeout}")
    private int timeout;
    @Value("${redis.password}")
    private String password;

    //自定义缓存key生成策略
//    @Bean
//    public KeyGenerator keyGenerator() {
//        return new KeyGenerator(){
//            @Override
//            public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
//                StringBuffer sb = new StringBuffer();
//                sb.append(target.getClass().getName());
//                sb.append(method.getName());
//                for(Object obj:params){
//                    sb.append(obj.toString());
//                }
//                return sb.toString();
//            }
//        };
//    }

    //    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
//        // Defaults
//        redisConnectionFactory.setHostName(host);
//        redisConnectionFactory.setPort(port);
//        return redisConnectionFactory;
//    }
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName(host);
        redisStandaloneConfiguration.setPort(port);
        redisStandaloneConfiguration.setPassword(password);
        redisStandaloneConfiguration.setDatabase(0);

        JedisClientConfiguration.JedisClientConfigurationBuilder
                jedisClientConfiguration = JedisClientConfiguration.builder();
        jedisClientConfiguration.connectTimeout(Duration.ofMillis(timeout));
        //  connection timeout
        JedisConnectionFactory factory = new JedisConnectionFactory(redisStandaloneConfiguration,
                jedisClientConfiguration.build());
        return factory;
    }

    //缓存管理器
    @Bean
    public CacheManager cacheManager(@Qualifier("jedisConnectionFactory") JedisConnectionFactory factory) {
        RedisCacheManager cacheManager = RedisCacheManager.create(factory);
        return cacheManager;
    }

    @Bean("jsonRedisTemplate")
    public RedisTemplate<String, String> redisTemplate(@Qualifier("jedisConnectionFactory")
                                                                   JedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        setSerializer(template);//设置序列化工具
        template.afterPropertiesSet();
        return template;
    }

    private void setSerializer(StringRedisTemplate template) {
        @SuppressWarnings({"rawtypes", "unchecked"})
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
    }
}
