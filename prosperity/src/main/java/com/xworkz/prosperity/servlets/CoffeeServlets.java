package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/pingme")
public class CoffeeServlets extends HttpServlet {

	public CoffeeServlets() {
		System.out.println("Created CoffeeServlets no arg");
	}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, 
IOException {
	System.out.println("Created doGet");
}

}
