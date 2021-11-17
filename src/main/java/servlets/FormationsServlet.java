package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import generateService.GenerateurFormations;
import models.Formation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FormationsServlet
 */
@WebServlet("/formations")
public class FormationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Formation> formations = new ArrayList<Formation>();
	private GenerateurFormations generateurFormation = GenerateurFormations.getInstance();

    /**
     * Default constructor. 
     */
    public FormationsServlet() {
        // TODO Auto-generated constructor stub
    	this.formations = generateurFormation.getFormations();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("formations", formations);
		request.getRequestDispatcher("/WEB-INF/Formations.jsp")
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
