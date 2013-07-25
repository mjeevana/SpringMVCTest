package com.seenukarthi.springmvc;

import org.apache.commons.lang.SerializationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome.html")
	public String welcome(Model model){
		model.addAttribute("message", "Spring 3 MVC Hello World");
		TestTO testTO1 = new TestTO();
		testTO1.setTestStr("Testing");
		TestTO testTO2 = (TestTO) SerializationUtils.clone(testTO1);
		System.out.println(testTO2.getTestStr());
		return "hello";
	}
	
}
