package org.neos.microprofile.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.annotation.Counted;

@Path("/")
@Counted
@RequestScoped
public class HelloResource {
	
	@GET
	public String grettings() {
		return "HELLO WORLD MICRO PROFILE!!!";
	}

}
