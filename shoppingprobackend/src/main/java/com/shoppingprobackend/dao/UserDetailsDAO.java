package com.shoppingprobackend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;

import com.shoppingprobackend.modal.UserDetails;

public interface UserDetailsDAO {
	public boolean addUserDetailsDAO(UserDetails userDetails);
	
}
