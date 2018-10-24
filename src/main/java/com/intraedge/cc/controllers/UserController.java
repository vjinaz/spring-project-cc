/**
 * 
 */
package com.intraedge.cc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intraedge.cc.models.User;

/**
 * @author vasanthj
 *
 */
@Controller
public class UserController {
	
	@RequestMapping("/registerUser.do")
	public void createUser(@ModelAttribute User user) {
		
	}

}
