package com.rays.curd;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestDelete {
	public static void main(String[] args) {
		
		
		UserDTO dto = new UserDTO();
		dto.setId(3);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();
		s.delete(dto);

		tx.commit();

		s.close();	
	
	}

}
