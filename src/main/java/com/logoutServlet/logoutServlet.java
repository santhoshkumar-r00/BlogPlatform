package com.logoutServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logoutServlet
 */
@WebServlet("/logoutServlet")
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String email=request.getParameter("email");
		
		 DriverManager out = null;
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/blogapplication", "root", "");
				PreparedStatement ps = con.prepareStatement("DELETE FROM user WHERE email = ?");
				
				ps.setString(1, email);
				
				int i = ps.executeUpdate();
				
				if(i>0) {
//					response.getWriter().append("<script>window.location.href='success.html'</script>");
					response.getWriter().append("<script>window.location.href='index.html'</script>");

				}
				else {
					response.getWriter().append("<script>alert('Invalided Value...');window.location.href='logout.html'</script>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				response.getWriter().append("<h1>Server :ERROR</H1>");
							}
		}

	}
