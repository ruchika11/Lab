package com.jlc.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddEnquiryServlet extends HttpServlet{
@Override
public void init() throws ServletException {
	System.out.println("init()");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String timing = req.getParameter("timing");
		String remark = req.getParameter("remarks");
		String[] cources = req.getParameterValues("courses");
		
		String msg = "Your enquiry Has Been Added Successfully";
		System.out.println("Full name: "+fname);
		System.out.println("Phone: "+phone);
		System.out.println("Email: "+email);
		System.out.println("Gender: "+gender);
		System.out.println("Timing: "+timing);
		for(String cos:cources){
			System.out.println("Cources: "+cources);
		}
		System.out.println("Remark: "+remark);
		
		
		res.setContentType("/text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1> Java Learning Center</h1>");
		pw.println("<h1>"+msg+"</h1>");
		pw.println("<h1>Full Name: "+fname);
		pw.println("<h1>Phone"+phone);
		pw.println("<h1>Email: "+email);
		pw.println("<h1>Gender: "+gender);
		pw.println("<h1>Timing: "+timing);
		for(String cos:cources){
			pw.println("<h1>Cources: "+cources);
		}
		pw.println("<h1>Remark: "+remark);
		
		
	}

@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}
