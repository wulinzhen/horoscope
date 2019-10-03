package com.boc.horoscope;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
//扫描包
@ComponentScan(basePackages = {"com.boc"})
//开启缓存
@EnableCaching
//开启Swagger2
@EnableSwagger2
public class HoroscopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoroscopeApplication.class, args);
	}

}

