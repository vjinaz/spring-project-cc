/**
 * 
 */
package com.intraedge.cc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vasanthj
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping("/")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/registration.do")
	public ModelAndView login() {
		System.out.println("Inside login controller");
		return null;
	}

}
