package com;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ChatServer {
	
	@WebMethod
	void test(String name);

	@WebMethod
	boolean[] findPrime(int limit);
	
	@WebMethod
	long fib(int n);
	
	@WebMethod
	long factorial(long n);
}

