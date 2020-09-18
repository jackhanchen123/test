package com.study.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getdata")
public class GetDataAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("month", new String[]{"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov", "Dec"});
		req.setAttribute("source", "Source: runoob.com");
		this.getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
	}
}
