package com.vanguard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @title SpringBoot应用的入口
 * @describe 运行此类中的main方法即可运行项目
 * @author vanguard
 * @version 1.0
 * @date 18/7/18
 */
@SpringBootApplication
@MapperScan(basePackages = "com.vanguard.mapper")
public class SystemBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemBApplication.class, args);
	}
}
