package com.tech.stprj01.b5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class B5Controller {
	
	@RequestMapping("/m1")
	public String m1() {
		return "m1";
	}

}
