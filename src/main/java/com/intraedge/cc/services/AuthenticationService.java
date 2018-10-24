/**
 * 
 */
package com.intraedge.cc.services;

/**
 * @author vasanthj
 *
 */
public interface AuthenticationService {

	/**
	 * Logs in the user by checking the credentials against the backend database.
	 * 
	 * @param username the user name
	 * @param password the password
	 * @return boolean indicating the status of the authentication
	 */
	public boolean login(String username, String password);

	/**
	 * Logs out the user by clearing the HttpSession. The caller of this method
	 * should redirect the user to the login page
	 */
	public void logout();

	/**
	 * Checks if authentication information is present in a browser cookie
	 * 
	 * @return boolean indicating whether the request is authenticated or not
	 */
	public boolean isAuthenticated();

}
