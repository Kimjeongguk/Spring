package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/Test01.do", method = RequestMethod.GET)
	public String test01() {
		//여기다가 처리해야할 것들 쓴다.
		System.out.println("Test01.do로 이동합니다.");
		return "test01";
	}
	
	@RequestMapping(value = "/Test02.do", method = RequestMethod.GET)
	public String test02() {
		System.out.println("Test02.do로 이동합니다.");
		return "test02";
	}
}
