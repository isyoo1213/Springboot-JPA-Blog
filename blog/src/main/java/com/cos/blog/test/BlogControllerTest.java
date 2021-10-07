package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//�������� com.cos.blog ��Ű�� ������ Ư�� ������̼��� �پ��ִ� Ŭ���� ���ϵ��� 
//new(IoC)�ؼ� ������ �����̳ʿ��� ����
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}