package com.emart.hibernet.dao;

public interface LoginDao {
	public void authenticate(String userName, String password);
	public void forgotPassword(String userEmail);
	public void resetPassword(String newPassword, String username);

}
