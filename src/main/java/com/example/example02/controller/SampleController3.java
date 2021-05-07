package com.example.example02.controller;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.*;

// request session에 접근
@Slf4j
@Controller
@RequestMapping("/sample2")
public class SampleController3 {
	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public void test3(HttpServletRequest request) {
		log.info("문자집합 : {} ", request.getCharacterEncoding());
		log.info("사용자 주소 : {} ", request.getRemoteAddr());
	}
	
	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public void test4(HttpSession session) {
		log.info("수명 : {} ", session.getMaxInactiveInterval());
		session.setMaxInactiveInterval(600);
		log.info("수명 : {} ", session.getMaxInactiveInterval());
	}
}
