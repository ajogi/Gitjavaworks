package javapoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServ
 */
@WebServlet(description = "accepts name", urlPatterns = { "/welcome" })
public class DemoServ extends HttpServlet{


public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
 
String name=req.getParameter("name");//will return value  
String password=req.getParameter("userpass");
pw.println("Welcome "+name+password);  
 
pw.close();  
}}