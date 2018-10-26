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

	// TODO
	// Autowire the AuthenticationService
	// Implement the AuthenticationService interface in the
	// com.intraedge.cc.services.impl package
	// Autowire an AuthenticationDao interface to this service implementation
	// Implement the AuthenticationDao interface in the com.intraedge.cc.daos.impl
	// package
	// Logic for Login - Use the hibernate template to execute a select query
	// against the 'user' table based on the username/password
	
	// Required services - AuthenticationService and AuthenticationDao
	// Required implementations - AuthenticationServiceImpl and AuthenticationDaoImpl
	// Required JSP - home.jsp

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
	public ModelAndView authenticateUser(// Retrieve the username/password from the request
	) {
		ModelAndView mv = new ModelAndView();
		// TODO
		// call the login(username, password) method in the AuthenticationService
		// reference
		// if the call returns 'true' show the home page to the user.
		// else show the login page again with an error message
		System.out.println("inside authentication controller");
		return mv;
	}

}
