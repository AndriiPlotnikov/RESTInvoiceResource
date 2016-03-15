package com.sarief;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.sarief.model.dao.stub.DaoInvoiceStub;

@SpringBootApplication
@ImportResource("com/sarief/beans.xml")
public class AssigmentInvoiceResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssigmentInvoiceResourceApplication.class, args);
	}

}
