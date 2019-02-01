package fr.akharroub.produits;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArraylistTestServlet
 */
@WebServlet(name = "test", urlPatterns = { "/test" })
public class ArraylistTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArraylistTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> ville = new ArrayList<>();
		ville.add("France");
		ville.add("Espagne");
		ville.add("belgique");
		ville.add("canada"); 
		ville.add("usa");
		ville.add("chine");
		
		System.out.println(ville.get(0));
		ville.remove(1);
		ville.remove("usa");
		
		ville.set(1, "belgium");
		//ville.clear();
		
		if(ville.contains("France")) {
			System.out.println("vive lille");
		}
		
		if(ville.contains("Espagne")) {
			System.out.println("madride");
		}
		
		request.setAttribute("ville", ville);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/arraylist.jsp")
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
