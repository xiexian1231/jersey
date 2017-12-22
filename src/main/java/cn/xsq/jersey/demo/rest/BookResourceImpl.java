package cn.xsq.jersey.demo.rest;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import cn.xsq.jersey.demo.service.IBookService;
import cn.xsq.jersey.model.Book;

@Component
public class BookResourceImpl implements IBookResource {
	
	@Resource
	private IBookService bookService;

	@Override
	public Book save() {
		Book book = new Book();
		book.setName("����¶�");
		book.setType("С˵");
		int rst = bookService.save(book);
		return book;
	}
	
}
