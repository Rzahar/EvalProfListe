package servlets;

import models.Teacher;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Teacher teacherTest = new Teacher("Toto", "toto", true);

		// Je set mon utilisateur dans ma session
		HttpSession session = request.getSession();
		session.setAttribute("USER", teacherTest);
		response.sendRedirect("/login");
		
		  String username = request.getParameter("username");
	        String password = request.getParameter("password");
	         
	        System.out.println("username: " + username);
	        System.out.println("password: " + password);
	 

	        // code récupéré du lien suivant : https://www.codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet
	        // Récupération de la réponse
	        PrintWriter writer = response.getWriter();
	         
	        // Construction du HTML
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Utilisateur: " + username + "<br/>";      
	        htmlRespone += "Mot de passe : " + password + "</h2>";    
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
