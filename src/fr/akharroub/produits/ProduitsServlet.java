package fr.akharroub.produits;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.beans.Produits;

/**
 * Servlet implementation class ProduitsServlet
 */
@WebServlet("/ProduitsServlet")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produits axe = new Produits("axe", 3.20, "https://www.nespresso.com/fr/fr/", "ressource/images/produits/axe.png");
		Produits lait = new Produits("lait", 1.20, "http://lactel.fr/", "ressource/images/produits/lait.png");
		Produits the = new Produits("the", 2.00, "https://www.lipton.com/fr/home.html", "ressource/images/produits/thé.jpg");
		Produits cafe = new Produits("cafe", 3.20, "https://www.nespresso.com/fr/fr/", "ressource/images/produits/cafe.jpg");
		Produits lindt = new Produits("lindt", 2.99, "https://www.lindt.fr/", "ressource/images/produits/lindt.jpg");
		Produits cristaline = new Produits("cristaline", 0.99, "https://www.moneaucristaline.fr/", "ressource/images/produits/cristaline.jpg");
		Produits jus = new Produits("jus", 3.99, "https://www.joker.fr/", "ressource/images/produits/jus.jpg");
		Produits cocacola = new Produits("coca cola", 1.99, "https://www.coca-cola-france.fr", "ressource/images/produits/coca-cola.jpg");
		
		Produits [] Produits= { axe, lait ,the,cafe,lindt ,cristaline,jus,cocacola};
		request.setAttribute("Produits", Produits);
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produits.jsp")
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
