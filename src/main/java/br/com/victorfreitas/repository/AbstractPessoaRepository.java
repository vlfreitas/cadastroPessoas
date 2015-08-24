package br.com.victorfreitas.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractPessoaRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void persist(Object entity) {
        getSession().persist(entity);
    }
}
