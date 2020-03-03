package com.emart.hibernet.service;

public interface LoginService {

	public void authenticate(String userName, String password);
	public void forgotPassword(String userEmail);
	public void resetPassword(String newPassword, String username);
}
