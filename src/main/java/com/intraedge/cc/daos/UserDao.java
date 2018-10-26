/**
 * 
 */
package com.intraedge.cc.daos;

import org.springframework.dao.DataAccessException;

import com.intraedge.cc.models.User;

/**
 * @author vasanthj
 *
 */
public interface UserDao {

	/**
	 * Create a user entity in the database
	 * 
	 * @param user the user entity
	 * @return row id of the entity in the database
	 */
	public long createUser(User user) throws DataAccessException;

	/**
	 * Change the password for a user
	 * 
	 * @param password the password
	 * @return indicates the status of the operation
	 */
	public boolean changePassword(String password);

}
