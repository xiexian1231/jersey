package cn.xsq.jersey.demo.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.xsq.jersey.model.Book;

@Path("books")
public interface IBookResource {
	@POST
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Book save();
	
}
