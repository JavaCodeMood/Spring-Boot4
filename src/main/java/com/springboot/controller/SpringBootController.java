package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.SpringBootBean;

@RestController
@RequestMapping("/springboot")
@SpringBootApplication
public class SpringBootController {
	@Autowired
	private SpringBootBean springBootBean;
	
	@RequestMapping("/user")
	public String index(){
		return  "用户姓名："+ springBootBean.getUsername()+
				"\t用户年龄："+ springBootBean.getAge()+
				"\t用户性别："+ springBootBean.getSex()+
				"\t用户住址："+ springBootBean.getAddress()+
				"\t用户联系方式："+ springBootBean.getPhone();
	}

}
