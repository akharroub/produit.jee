package fr.akharroub.produits;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.beans.Personne;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet(name = "accueil", urlPatterns = { "/accueil" })
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccueilServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Personne jj = new Personne ("jamse","hgt",30,1.70,80);
		
		Personne tg = new Personne ("thome","jhon",50,1.90,60);
		
		Personne je = new Personne ("sodi","bono",25,1.50,50);
		
		
		Personne [] personne = {jj , tg , je};
		request.setAttribute("personnes", personne);
		
		

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/accueil.jsp")
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
