package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import generateService.GenerateurFormations;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet("/formation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GenerateurFormations generateurFormation = GenerateurFormations.getInstance();
	private Formation formation;

	/**
	 * Default constructor.
	 */
	public FormationServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		formation = this.generateurFormation.getFormationByName("title");
		if (formation == null) {
			return;
		}
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
