package com.signinServlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class signinServlet
 */
@WebServlet("/signinServlet")
public class signinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public signinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/blogapplication", "root", "");
			PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet i = ps.executeQuery();

			if (i.next()) {
//					response.getWriter().append("<script>window.location.href='success.html'</script>");
				out.println("<script>window.location.href='main.html'</script>");

			} else {
				response.getWriter()
						.append("<script>alert('Invalided Value...');window.location.href='signin.html'</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append("<h1>Server :ERROR</H1>");

		}
	}

}
