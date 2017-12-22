package cn.xsq.jersey.api;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationAPI extends ResourceConfig {

	public ApplicationAPI() {
		packages("cn.xsq.jersey.*.rest");
	}
	
}
