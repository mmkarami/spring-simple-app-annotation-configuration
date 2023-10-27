package com.mmkarami.spring;

import org.springframework.stereotype.Component;

@Component
public class HPPrinter<T> implements Printer<T> {

	@Override
	public void print(T t) {
		System.out.println(t.toString());
	}

}