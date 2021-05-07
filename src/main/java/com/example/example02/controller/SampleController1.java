package com.example.example02.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.*;

// /sample2/test1 Get
/*
 *  @WebServlet("sample2/test1")
 *  public void doGet(HttpServletRequest request, HttpServletResponse response) {}
 */
@Controller
@Slf4j
public class SampleController1 {
	@RequestMapping("/sample2/test1")
	public void test1() {
		log.info("컨트롤러 호출");
	}
	
	@RequestMapping("/example/post")
	public void test2() {
		log.info("안녕하세요");
	}
}
