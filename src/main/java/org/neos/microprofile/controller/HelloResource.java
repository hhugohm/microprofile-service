package org.neos.microprofile.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
@RequestScoped
public class HelloResource {
	
	@GET
	public String grettings() {
		return "HELLO WORLD MICRO PROFILE!!!";
	}

}
