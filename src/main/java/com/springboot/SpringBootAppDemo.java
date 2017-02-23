package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppDemo {
	public static void main(String[] args) {
		//启动SpringBoot
		SpringApplication.run(SpringBootAppDemo.class, args);
	}

}
//访问路径：http://localhost:8080/springboot/user