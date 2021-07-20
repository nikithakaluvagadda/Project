package com.training;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Book;
import com.training.services.BookService;

/**
 * Servlet implementation class GreetingServlets
 */
@WebServlet("/greeting")
public class GreetingServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private BookService service;
    public GreetingServlets() {
        super();
        // TODO Auto-generated constructor stub
        service=new BookService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("city" ,"hyd");
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=request.getRequestDispatcher("/show.jsp");
		dispatcher.forward(request,response);
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String srch=request.getParameter("srchString");
			
			request.setAttribute("city" ,"hyd");
			List<Book>bookList=service.searchBook(srch);
			
			request.setAttribute("srch" ,bookList);
			// TODO Auto-generated method stub
			RequestDispatcher dispatcher=request.getRequestDispatcher("/show.jsp");
			dispatcher.forward(request,response);
		
	
	}
	

}
