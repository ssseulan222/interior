package com.interior.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.action.ActionForward;
//import com.interior.expert.ExpertService1;


/**
 * Servlet implementation class MainController
 */
@WebServlet("/ExpertController")
public class ExpertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private ExpertService1 expertService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpertController() {
        super();
     //   expertService = new ExpertService1();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getPathInfo();
		ActionForward actionForward = null;
		if(command.equals("/ExpertJoin")) {
		//	actionForward = expertService.insert(request, response);
		}
		
		/* ------ 06.20 18:56 - 난슬 ----------*/
		else if(command.equals("/ExpertMain")){
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/expert/ExpertMain.jsp");
			view.forward(request, response);
		}
		/*---------------------------------*/
		
		else {
			actionForward = new ActionForward();
			actionForward.setCheck(true);
			actionForward.setPath("../Main.do");
		}
		
		if(actionForward.isCheck()) {
			RequestDispatcher view = request.getRequestDispatcher(actionForward.getPath());
			view.forward(request, response);
		}else {
			response.sendRedirect(actionForward.getPath());
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
