package com.mybatis.tutorial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.mybatis.tutorial.mapper")
@SpringBootApplication
public class MybatisTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisTutorialApplication.class, args);
	}
}
