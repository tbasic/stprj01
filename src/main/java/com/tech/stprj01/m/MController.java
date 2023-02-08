package com.tech.stprj01.m;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MController {
	
	@RequestMapping("/m1")
	public String m1() {
		return "m1";
	}

}
