package com.poly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChuNhatServlet
 */
@WebServlet("/ChuNhatServlet")
public class ChuNhatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuNhatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/param/formchunhat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String dai=request.getParameter("chieudai");
		String rong=request.getParameter("chieurong");
		Double rongg=Double.parseDouble(rong);
		Double daii=Double.parseDouble(dai);
		Double dt=daii*rongg;
		Double cv=(daii+rongg)*2;
		request.setAttribute("ketqua", dt);
		request.setAttribute("ketquaa",cv);
		request.getRequestDispatcher("/views/param/ketqua.jsp").forward(request, response);

	}

}
