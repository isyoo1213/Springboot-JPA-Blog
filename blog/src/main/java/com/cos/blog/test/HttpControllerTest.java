package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller(HTML ����)
//������� ��û�� ���� ����(data)
@RestController
public class HttpControllerTest {
	
	@GetMapping("/http/get")
	public String getTest() {
		return "get��û";
	}
	
	@PostMapping("/http/post")
	public String postTest() {
		return "post��û";
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "put��û";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete��û";
	}
	
	

}
