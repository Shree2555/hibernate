package com.alluswell.dao;





import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alluswell.entity.FacebookUser;


public class FacebookDAO implements FacebookDAOInterface {

	public int createProfileDAO(FacebookUser fb) {
		// TODO Auto-generated method stub
		int i=0;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		EntityTransaction et=s.getTransaction();
		et.begin();
		
		s.save(fb);
		et.commit();
		i=1;
		return i;
	}

}
