package cn.xsq.jersey.demo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.xsq.jersey.model.Book;
@Repository
public class BookDaoImpl implements IBookDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int save(Book instance) {
		return (int) this.sessionFactory.getCurrentSession().save(instance);
	}

}
