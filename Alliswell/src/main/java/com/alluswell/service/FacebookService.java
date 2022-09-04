package com.alluswell.service;

import com.alluswell.dao.FacebookDAO;
import com.alluswell.dao.FacebookDAOInterface;
import com.alluswell.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	public int createProfileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fb);
		return i;
	}

}
