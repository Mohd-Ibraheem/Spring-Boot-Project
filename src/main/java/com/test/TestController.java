package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {

		int a = 60;
		int b = 30;
		int c=70;

		return "this is for testing /t sum of a and b is " + (a + b+c);
	}

}
