package com.muyou.xmlDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

	@RequestMapping("demo")
	public String demo() {
		return "demo";
	}
}
