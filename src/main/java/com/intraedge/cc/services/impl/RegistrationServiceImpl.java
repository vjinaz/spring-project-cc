/**
 * 
 */
package com.intraedge.cc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.intraedge.cc.daos.UserDao;
import com.intraedge.cc.exceptions.RegistrationException;
import com.intraedge.cc.models.User;
import com.intraedge.cc.services.RegistrationService;

/**
 * @author vasanthj
 *
 */
@Component
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private UserDao userDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.intraedge.cc.services.RegistrationService#registerUser(com.intraedge.cc.
	 * models.User)
	 */
	public void registerUser(User user) throws RegistrationException {
		System.out.println("Inside Registration Service");
		try {
			userDao.createUser(user);
		} catch (DataAccessException d) {
			d.printStackTrace();
			throw new RegistrationException("Something went bad in the database call. Please try again!");
		}
	}

}
