/**
 * 
 */
package com.intraedge.cc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intraedge.cc.exceptions.RegistrationException;
import com.intraedge.cc.models.User;
import com.intraedge.cc.services.RegistrationService;
import com.intraedge.cc.utilities.CCConstants;

/**
 * @author vasanthj
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("/registerUser")
	public ModelAndView login(@ModelAttribute User user) {
		user.setRole(CCConstants.ROLE_USER);
		ModelAndView mv = new ModelAndView();
		try {
			registrationService.registerUser(user);
			mv.setViewName("home");
			
		} catch (RegistrationException e) {
			System.out.println("Registration exception caught");
			// TODO Auto-generated catch block
			mv.setViewName("registrationFailed");
		}
		return mv;
	}

}
