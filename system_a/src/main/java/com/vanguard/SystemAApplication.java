package com.vanguard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jms.annotation.EnableJms;
import tk.mybatis.spring.annotation.MapperScan;

import javax.persistence.Table;

/**
 * @title SpringBoot应用的入口
 * @describe 运行此类中的main方法即可运行项目
 * @author vanguard
 * @version 1.0
 * @date 18/7/18
 */
@EnableJms
@SpringBootApplication
@MapperScan(basePackages = "com.vanguard.mapper")
public class SystemAApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SystemAApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}
