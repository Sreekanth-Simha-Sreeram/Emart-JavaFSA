package com.emart.hibernet.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory ;

	public void authenticate(String userName, String password) {
		// TODO Auto-generated method stub

	}

	public void forgotPassword(String userEmail) {
		// TODO Auto-generated method stub

	}

	public void resetPassword(String newPassword, String username) {
		// TODO Auto-generated method stub

	}

}
