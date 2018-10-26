/**
 * 
 */
package com.intraedge.cc.services;

import com.intraedge.cc.exceptions.RegistrationException;
import com.intraedge.cc.models.User;

/**
 * @author vasanthj
 *
 */
public interface RegistrationService {
	
	/**
	 * Registers a user in the database
	 * @param user the user object
	 */
	public void registerUser(User user) throws RegistrationException;

}
