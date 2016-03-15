package com.sarief.model.dao.stub;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sarief.model.entities.Invoice;

/**
 * basic test for mock database
 * @author Andrii
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DaoInvoiceStub.class)
@WebAppConfiguration
public class DaoInvoiceStubTest {

	@Test
	public void test() {
		DaoInvoiceStub dao = new DaoInvoiceStub();
		
		Invoice invoice = new Invoice();
		invoice.setId(6);
		invoice.setSeller("Sarief");
		invoice.setBuyer("Spring");
		
		Invoice otherInvoice = dao.create(invoice);
		
		assertEquals(invoice, otherInvoice);
		assertEquals(invoice.getId(), 3); // I've supposed that in stub 0, 1, 2 already defined 
		
		//assertEquals(dao.read(0), dao.read(1));
		//assertEquals(dao.read(0), dao.read(2));
		
	}

}
