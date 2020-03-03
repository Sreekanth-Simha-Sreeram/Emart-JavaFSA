package com.emart.hibernet.service;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.emart.hibernet.model.Emart;
@Component
@Repository
public abstract class EmartDAOImpl implements EMartDAO{
	@Autowired
	private SessionFactory sessionFactory ;
	


	public String addItem1(Emart std) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emart getItem1(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public List<Emart> getAllItem() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from product");
		
		
		return query.list();
		
	}

	public String addItem(Emart std) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emart getItem(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
