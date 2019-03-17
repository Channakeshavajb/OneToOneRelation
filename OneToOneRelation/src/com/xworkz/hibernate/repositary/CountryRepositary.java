package com.xworkz.hibernate.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.entity.CountryEntity;

public class CountryRepositary {

	public CountryRepositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void save(CountryEntity entity) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
			session.getTransaction().rollback();
		}

		finally {
			session.close();
			factory.close();
		}
	}

}
