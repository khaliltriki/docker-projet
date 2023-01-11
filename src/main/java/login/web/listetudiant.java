package login.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.bean.Loginbean;
import login.database.LoginDao;

/**
 * Servlet implementation class listetudiant
 */
@WebServlet( "/etudiant" )
public class listetudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listetudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		String nom = request.getParameter("nom");
		String date_ins = request.getParameter("date_ins");
		String sex = request.getParameter("sex");
		
		Loginbean loginbean = new Loginbean();
		loginbean.setId(id);
		loginbean.setnom(nom);
		loginbean.setDate_ins(date_ins);
		loginbean.setSex(sex);
		
		
		LoginDao loginDao = new LoginDao();
		String result = loginDao.listetudiant(loginbean);
		response.getWriter().print(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nom = request.getParameter("nom");
		String date_ins = request.getParameter("date_ins");
		String sex = request.getParameter("sex");
		
		Loginbean loginbean = new Loginbean();
		loginbean.setId(id);
		loginbean.setnom(nom);
		loginbean.setDate_ins(date_ins);
		loginbean.setSex(sex);
		
		
		LoginDao loginDao = new LoginDao();
		String result = loginDao.listetudiant(loginbean);
		response.getWriter().print(result);
	}

}
