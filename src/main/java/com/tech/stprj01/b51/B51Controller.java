package com.tech.stprj01.b51;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class B51Controller {
	
	@RequestMapping("/b51")
	public String b51() {
		return "b51";
	}
	
	@RequestMapping("/b52")
	public String b52() {
		return "b52";
	}
	
	
	

}
