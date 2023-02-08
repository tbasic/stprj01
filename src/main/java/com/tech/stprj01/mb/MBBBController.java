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
	
	@RequestMapping("/mb2_1")
	public String mb2_1() {
		return "mb2_1";
	}
	@RequestMapping("/mb2_2")
	public String mb2_2() {
		return "mb2_2";
	}
	@RequestMapping("/mb2_3")
	public String mb2_3() {
		return "mb2_3";
	}
<<<<<<< HEAD
	@RequestMapping("/mb110")
	public String mb110() {
		return "mb110";
=======
	@RequestMapping("/mb11_1")
	public String mb11_1() {
		return "mb11_1";
>>>>>>> mb11_b1
	}
	

}
