package com.sarief;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sarief.controller.InvoiceResource;

@Component
@ApplicationPath("/webapi")
public class RegisterJersey extends ResourceConfig{
	public RegisterJersey() {
		register(InvoiceResource.class);
	}
}
