package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("hello.htm")
	public String printWelcome() {
		System.out.print("---------------hi,boy@~~--");
		return "hi";
	}
}