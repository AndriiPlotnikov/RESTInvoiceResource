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
	
	/**
	 * auto-generated hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Buyer == null) ? 0 : Buyer.hashCode());
		result = prime * result + ((Seller == null) ? 0 : Seller.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	/**
	 * auto-generated equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (Buyer == null) {
			if (other.Buyer != null)
				return false;
		} else if (!Buyer.equals(other.Buyer))
			return false;
		if (Seller == null) {
			if (other.Seller != null)
				return false;
		} else if (!Seller.equals(other.Seller))
			return false;
		if (id != other.id)
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	
	
	
}
