/**
 * 
 */
package com.intraedge.cc.daos.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.intraedge.cc.daos.UserDao;
import com.intraedge.cc.models.User;

/**
 * @author vasanthj
 *
 */
@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/* (non-Javadoc)
	 * @see com.intraedge.cc.daos.UserDao#createUser(com.intraedge.cc.models.User)
	 */
	public int createUser(User user) throws DataAccessException {
		System.out.println("Inside UserDao impl");
		return (Integer)hibernateTemplate.save(user);
	}

	/* (non-Javadoc)
	 * @see com.intraedge.cc.daos.UserDao#changePassword(java.lang.String)
	 */
	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
