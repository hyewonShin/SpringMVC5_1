package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	//public String test1(@ModelAttribute DataBean bean ) {
	// @ModelAttribute 는 생략 가능 
	  public String test1 (DataBean bean ) {
		
		//System.out.printf("data1 : %s\n", bean.getData1());
		//System.out.printf("data2 : %s\n", bean.getData2());
		
		return "test1";
	}
	
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean) {
		return "test2";
	}
	
}
