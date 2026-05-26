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
 * Servlet implementation class EditStudentServlet
 */
@WebServlet("/edit")
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private StudentDao dao = new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int id = Integer.parseInt(request.getParameter("id"));
	        Student student = dao.getById(id);
	        request.setAttribute("stu", student);
	        request.getRequestDispatcher("/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int id = Integer.parseInt(request.getParameter("id"));
	        String name = request.getParameter("name");
	        int age = Integer.parseInt(request.getParameter("age"));
	        String major = request.getParameter("major");

	        Student student = new Student();
	        student.setId(id);
	        student.setName(name);
	        student.setAge(age);
	        student.setMajor(major);

	        dao.update(student);
	        // 修改完成跳转到列表页
	        response.sendRedirect("StudentListServlet");
	}

}
