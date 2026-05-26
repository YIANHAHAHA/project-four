package com.example.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Dao.StudentDao;
import com.example.Entity.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDao dao = new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String name = request.getParameter("name");
	        int age = Integer.parseInt(request.getParameter("age"));
	        String major = request.getParameter("major");

	        Student s = new Student(null, name, age, major);
	        dao.add(s);
	        response.sendRedirect("StudentListServlet");
	}

}
