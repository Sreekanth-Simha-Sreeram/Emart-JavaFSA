package com.emart.hibernet.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.emart.hibernet.dao.LoginDao;
import com.emart.hibernet.service.LoginService;
@Component
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao logindao;
	@Transactional
	public void authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void forgotPassword(String userEmail) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void resetPassword(String newPassword, String username) {
		// TODO Auto-generated method stub
		
	}

	

}
