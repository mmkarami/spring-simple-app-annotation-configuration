package com.mmkarami.spring;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Person {

	Printer<Bill> printer;
	
	public Employee(Printer<Bill> printer) {
		this.printer = printer;
	}

	@Override
	public void printBill(Bill bill) {
		printer.print(bill);
	}

}