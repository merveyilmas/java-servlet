package com.servletfilterexample.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//processing..
		System.out.println("Before filter2");
		
		//filter or servlet
		chain.doFilter(request, response);
		
		//processing
		System.out.println("After servlet2");
	}

}
