package com.sarief.model.entities;

import javax.xml.bind.annotation.XmlRootElement;

enum InvoiceState{
	UNPAID, PAID, CLOSED, REFUSED
}

/**
 * Invoice, main entity
 * @author Andrii
 *
 */
@XmlRootElement
public class Invoice {
	private long id;
	private String Buyer;
	private String Seller;
	private InvoiceState state = InvoiceState.UNPAID;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBuyer() {
		return Buyer;
	}
	public void setBuyer(String buyer) {
		Buyer = buyer;
	}
	public String getSeller() {
		return Seller;
	}
	public void setSeller(String seller) {
		Seller = seller;
	}
	public InvoiceState getState() {
		return state;
	}
	public void setState(InvoiceState state) {
		this.state = state;
	}
	
}
