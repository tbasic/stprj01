package com.tech.stprj01.m;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MController {
	
	@RequestMapping("/a1")
	public String a1() {
		return "a1";
	}
	@RequestMapping("/a2")
	public String a2() {
		return "a2";
	}
	

}
