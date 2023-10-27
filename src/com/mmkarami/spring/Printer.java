package com.mmkarami.spring;

public interface Printer<T> {
	void print(T t);
}