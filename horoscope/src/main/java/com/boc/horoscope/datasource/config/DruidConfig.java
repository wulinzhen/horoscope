package com.boc.horoscope.datasource.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;


@Configuration
@EnableAutoConfiguration
public class DruidConfig  {

    @Autowired
    private Environment environment;

    @Value("${spring.datasource.db1.username}")
    private String userName;

    @Primary
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource db1DataSource() {
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        System.out.println(userName);
        return dataSource;
    }
}
