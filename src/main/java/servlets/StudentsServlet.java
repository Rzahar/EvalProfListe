package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;
import generateService.GenerateurStudents;
/**
 * Servlet implementation class StudentsServlet
 */
@WebServlet("/eleves")
public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Student> students = new ArrayList<Student>();
	private GenerateurStudents generateurStudent = GenerateurStudents.getInstance();

    /**
     * Default constructor. 
     */
    public StudentsServlet() {
        // TODO Auto-generated constructor stub
    	this.students = generateurStudent.getStudents();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("students", students);
		request.getRequestDispatcher("/WEB-INF/Eleves.jsp")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
