package Controller.MonHoc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MonHocDAO;
import Model.MonHoc;

/**
 * Servlet implementation class Add
 */
@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MonHocDAO monHocDAO = new MonHocDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("addMonHoc.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MonHoc monHoc = new MonHoc();
		monHoc.setTenMonHoc(request.getParameter("tenMonHoc"));
		monHoc.setSoTinChi(Integer.parseInt(request.getParameter("sotinchi")));
		try {
			monHocDAO.add(monHoc);
			response.sendRedirect("/LeNguyenTuanKiet20110286/");
		} catch (SQLException e) {
			response.sendRedirect("/LeNguyenTuanKiet20110286/404.jsp");
		}
	}

}
