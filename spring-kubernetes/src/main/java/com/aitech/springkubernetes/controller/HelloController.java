package com.aitech.springkubernetes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("sayHello")
	@ResponseBody
	public String getProcess() {
		return "Hello nassim from docker...";
	}

}
