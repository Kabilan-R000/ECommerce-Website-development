package com.shopNest.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.DataInjector;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
				String uname=req.getParameter("uname");
				String mail=req.getParameter("mail");
				String pass=req.getParameter("pass");
				String gender=req.getParameter("gender");
				String dob=req.getParameter("dob");
				String address=req.getParameter("address");
				String pin=req.getParameter("pin");
				
				String status=DataInjector.addCustomer(uname, mail, pass, gender, address,dob,pin);
				
				resp.sendRedirect("home.jsp");
		}
}