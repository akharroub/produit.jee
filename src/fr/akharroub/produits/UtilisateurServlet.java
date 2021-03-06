package fr.akharroub.produits;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.beans.Utilisateur;

/**
 * Servlet implementation class Utilisateur
 */
@WebServlet("/Utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utilisateur therock = new Utilisateur("the", "rock", "https://assets.vogue.com/photos/59132f18dc6868483f55b55a/master/pass/00-lede-the-rock.jpg", 48);
		Utilisateur kevinhart = new Utilisateur("kevin", "hart", "data:image/jpeg;base64,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", 42);
		Utilisateur bradleycooper = new Utilisateur("bradley", "cooper", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Bradley_Cooper_%2829670050807%29_%28cropped_2%29.jpg/220px-Bradley_Cooper_%2829670050807%29_%28cropped_2%29.jpg", 40);
		Utilisateur bradpitt = new Utilisateur("brad", "pitt", "https://resize-parismatch.ladmedia.fr/r/625,417,center-middle,ffffff/img/var/news/storage/images/paris-match/people/brad-pitt-un-homme-au-grand-coeur-1275674/21319826-4-fre-FR/Brad-Pitt-un-homme-au-grand-coeur.jpg", 50);
		Utilisateur jackiechan = new Utilisateur("jackie", "chan", "https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cg_face%2Cq_auto:good%2Cw_300/MTE5NTU2MzE2NDE4MzExNjkx/jackie-chan-9542080-1-402.jpg", 52);
		Utilisateur jetlee = new Utilisateur("jet", "lee", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Jet_Li_2009_%28cropped%29.jpg/220px-Jet_Li_2009_%28cropped%29.jpg", 60);
		Utilisateur anjolinajoli = new Utilisateur("anjolina", "joli", "https://www.gannett-cdn.com/-mm-/ac688eec997d2fce10372bf71657297ff863814d/c=171-0-1195-768/local/-/media/2018/12/20/USATODAY/usatsports/247WallSt.com-247WS-513885-imageForEntry10-14.jpg?width=534&height=401&fit=crop", 46);
		Utilisateur salmahayek = new Utilisateur("salma", "hayek", "https://www.abc.net.au/news/image/9757666-3x2-940x627.jpg", 41);
		
		Utilisateur [] Utilisateur = { therock, kevinhart, bradleycooper, bradpitt, jackiechan, jetlee , anjolinajoli ,salmahayek};
		request.setAttribute("Utilisateur", Utilisateur);
				
		
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/Utilisateur.jsp")
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
