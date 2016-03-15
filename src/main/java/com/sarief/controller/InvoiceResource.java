package com.sarief.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.sarief.model.dao.interfaces.IDaoEntity;
import com.sarief.model.entities.Invoice;

/**
 * REST resource point
 * 
 * @author Andrii
 *
 */
@Component
@Path("/invoices")
public class InvoiceResource implements ApplicationContextAware {
	
	/**
	 * context of application
	 */
	private ApplicationContext context;
	/**
	 * DAO for invoice
	 */
	private IDaoEntity<Invoice> DaoInvoice;



	public IDaoEntity<Invoice> getDaoInvoice() {
		return DaoInvoice;
	}



	public void setDaoInvoice(IDaoEntity<Invoice> daoInvoice) {
		DaoInvoice = daoInvoice;
	}



	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Invoice> getInvoices(){
		return DaoInvoice.readAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Invoice addInvoice(Invoice invoice){
		return DaoInvoice.create(invoice);
	}
	

	@GET
	@Path("/{invoiceId}")
	@Produces(MediaType.APPLICATION_XML)
	public Invoice getInvoice(@PathParam("invoiceId") long invoiceId){
		return DaoInvoice.read(invoiceId);
	}


	@PUT
	@Path("/{invoiceId}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Invoice updateInvoice(@PathParam("invoiceId") long invoiceId, Invoice invoice){
		invoice.setId(invoiceId);
		return DaoInvoice.update(invoice);
	}
	
	@DELETE
	@Path("/{invoiceId}")
	@Produces(MediaType.APPLICATION_XML)
	public Invoice deleteInvoice(@PathParam("invoiceId") long invoiceId){
		return DaoInvoice.delete(invoiceId);
	}
	

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		DaoInvoice = (IDaoEntity<Invoice>) context.getBean("DaoInvoiceImplementation");
	}
}
