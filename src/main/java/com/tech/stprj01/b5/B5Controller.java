package com.tech.stprj01.b5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class B5Controller {
	
	@RequestMapping("/a1")
	public String a1() {
		return "a1";
	}

}
