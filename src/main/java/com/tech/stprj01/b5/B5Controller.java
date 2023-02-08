package com.tech.stprj01.b5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class B5Controller {
	
	@RequestMapping("/b1")
	public String b1() {
		return "b1";
	}
	@RequestMapping("/b2")
	public String b2() {
		return "b2";
	}
	
	
	

}
