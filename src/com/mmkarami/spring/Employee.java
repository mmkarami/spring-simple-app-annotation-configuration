package com.mmkarami.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Person {

	@Autowired
	Printer<Bill> printer;

	@Override
	public void printBill(Bill bill) {
		printer.print(bill);
	}

}