package com.bridgelabz.usermanagement.controller;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.bridgelabz.usermanagement.model.Registration;
import com.bridgelabz.usermanagement.services.IServices;

@Path("admin")
@Stateless
public class AdminController {
	
	@EJB
	private IServices services;
	
    public AdminController() {
    }
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String addUser(Registration registration) {
		return services.addUser(registration) ; 
	}

}
