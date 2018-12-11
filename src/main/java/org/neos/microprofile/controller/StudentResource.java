package org.neos.microprofile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.neos.microprofile.domain.Student;

@Path("/api/students")
@Counted
@RequestScoped
public class StudentResource {
	
	
	
	@GET
	public List<Student> getAll() {
		List<Student> list = new ArrayList<Student>();

		Student a = new Student(new Long(12), "Mario", "232332");
		Student b = new Student(new Long(234), "Jorge", "433");
		Student c = new Student(new Long(2323), "Laura", "4334");

		list.add(a);
		list.add(b);
		list.add(c);

		return list;

	}

}
