package com.tech.stprj01.mb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MBBBController {
	
	@RequestMapping("/mb1")
	public String mb1() {
		return "mb1";
	}
	
	@RequestMapping("/mb2")
	public String mb2() {
		return "mb2";
	}
	

}
