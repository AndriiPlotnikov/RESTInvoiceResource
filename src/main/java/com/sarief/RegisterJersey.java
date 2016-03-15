package com.sarief;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sarief.controller.InvoiceResource;

/**
 * Class with sole puprose of registring jersey
 * Without defining ApplicationPath may be conflict between frameworks (jersey and springboot). 
 * @author Andrii
 *
 */
@Component
@ApplicationPath("/webapi")
public class RegisterJersey extends ResourceConfig{
	public RegisterJersey() {
		register(InvoiceResource.class);
	}
}
