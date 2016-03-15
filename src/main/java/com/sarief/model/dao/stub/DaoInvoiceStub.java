package com.sarief.model.dao.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sarief.model.dao.interfaces.IDaoEntity;
import com.sarief.model.entities.Invoice;

/**
 * mock database
 * @author Андрей
 *
 */
public class DaoInvoiceStub implements IDaoEntity<Invoice> {
	private static final Map<Long, Invoice> invoices = new HashMap<>();

	static {
		Invoice invoice0 = new Invoice();
		Invoice invoice1 = new Invoice();
		Invoice invoice2 = new Invoice();
		
		invoice0.setId(invoices.size());
		invoice0.setBuyer("buyer0");
		invoice0.setSeller("seller0");
		invoices.put(invoice0.getId(), invoice0);
		
		invoice1.setId(invoices.size());
		invoice1.setBuyer("buyer1");
		invoice1.setSeller("seller1");
		invoices.put(invoice1.getId(), invoice1);
		
		invoice2.setId(invoices.size());
		invoice2.setBuyer("buyer2");
		invoice2.setSeller("seller2");
		invoices.put(invoice2.getId(), invoice2);
		
		
		

	}

	@Override
	public Invoice create(Invoice entity) {
		entity.setId(invoices.size());
		invoices.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Invoice read(long id) {
		return invoices.get(id);
	}

	@Override
	public Invoice update(Invoice entity) {
		if (entity.getId() < 0 || entity.getState() == null) {
			return null;
		}
		return invoices.replace(entity.getId(), entity);
	}

	@Override
	public Invoice delete(long id) {
		return invoices.remove(id);
	}

	@Override
	public List<Invoice> readAll() {
		return new ArrayList<Invoice>(invoices.values());
	}

}
