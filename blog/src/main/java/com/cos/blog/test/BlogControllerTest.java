package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//스프링이 com.cos.blog 패키지 이하의 특정 어노테이션이 붙어있는 클래스 파일들을 
//new(IoC)해서 스프링 컨테이너에서 관리
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}