package com.seenukarthi.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.SerializationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/getJson.html")
	public @ResponseBody List<TestTO> getJson(Model model){
		List<TestTO> testTOs = new ArrayList<>();
		TestTO testTO1 = new TestTO();
		testTO1.setTestStr("Testing");
		testTOs.add(testTO1);
		return testTOs;
	}
	
}
