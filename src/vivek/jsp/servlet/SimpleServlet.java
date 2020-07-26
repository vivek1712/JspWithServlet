package vivek.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res){
	PrintWriter out = null;
	try {
		out = res.getWriter();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.println("success from post");
	try {
		res.sendRedirect("welcome.jsp");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void doGet(HttpServletRequest req,HttpServletResponse res){
	PrintWriter out = null;
	try {
		out = res.getWriter();
		out.println("success");
		res.sendRedirect("welcome.jsp");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
