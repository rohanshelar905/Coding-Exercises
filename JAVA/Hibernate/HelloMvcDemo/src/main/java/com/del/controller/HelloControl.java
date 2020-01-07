package com.del.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControl {

	@RequestMapping("/hello.htm")
	public ModelAndView greet(@RequestParam("uname") String name) throws Exception {

		ModelAndView mv = new ModelAndView("welcome","name" , name);

		/*// name of JSP page
		mv.setViewName("welcome");

		// data that you want to show on JSP in form of key and value
		mv.addObject("name", name);*/

		return mv;
	}

}
