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
	
	@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}
	
	@RequestMapping("/authenticateUser")
	public ModelAndView authenticateUser() {
		ModelAndView mv = new ModelAndView();
		System.out.println("inside authentication controller");
		return mv;
	}
	
}
