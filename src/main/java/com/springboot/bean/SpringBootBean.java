package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
/*
 通过@ConfigurationProperties加载properties文件内的配置，通过prefix
属性指定properties的配置的前缀，通过locations指定properties文件的位置。
例如：@ConfigurationProperties(prefix="user",
    locations={"classpath:config/application.properties"})
 本例不需要配置
 */
public class SpringBootBean {
	
	private String username;
	private int age;
	private String address;
	private String sex;
	private String phone;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
