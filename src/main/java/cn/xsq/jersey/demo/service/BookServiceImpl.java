package cn.xsq.jersey.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xsq.jersey.demo.dao.IBookDao;
import cn.xsq.jersey.model.Book;
@Service
@Transactional
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookDao bookDao;
	
	@Override
	public int save(Book instance) {
		// TODO Auto-generated method stub
		return bookDao.save(instance);
	}

}
