/**
 * 
 */
package com.intraedge.cc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intraedge.cc.models.User;

/**
 * @author vasanthj
 *
 */
@Controller
public class UserController {
	
	@RequestMapping("/registerUser")
	public ModelAndView login() {
		System.out.println("Inside registration controller");
		return null;
	}

}
