package com.example.H2CURD2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@RequestMapping("test")
	public String m1() {
		return "ranjit";
		
	}
}
