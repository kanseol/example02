package com.example.example02.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.*;

// get, post 매핑

// 1. component-scan의 대상
// 2. 주소를 매핑
@Controller
@Slf4j
public class SampleController2 {
	// 어노테이션에 필드기본이름은 value. value만 지정할때는 생략가능
	// 필드 두개 이상 지정할 때는 value 생략 못함
	@RequestMapping(value = "/sample2/test2", method=RequestMethod.GET)
	public void test1() {
		log.info("get 방식 요청");
	}
	
	@RequestMapping(value = "/sample2/test2", method=RequestMethod.POST)
	public void test2() {
		log.info("post 방식 요청");
	}
}
