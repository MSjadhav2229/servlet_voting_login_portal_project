package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import dao.RegisterDao;
import com.jsp.dto.Member;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		Member member=new Member(uname,password,email,phone);
		
		RegisterDao rDao= new RegisterDao();
		rDao.insert(member);
		response.getWriter().print("<html><body bgcolor='cyan'><h1> Data is entered Successfully </h1></body></html>");
		
		
	}

}
