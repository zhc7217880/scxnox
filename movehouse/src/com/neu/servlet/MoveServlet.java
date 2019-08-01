package com.neu.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.MoveDao;
import com.neu.dao.MoveDaoImpl;
import com.neu.entity.Move;
import com.neu.service.MoveService;
import com.neu.service.MoveServiceImpl;

/**
 * Servlet implementation class MoveServlet
 */
@WebServlet("/MoveServlet")
public class MoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if("regist".equals(method)) {
			regist(request,response);
		}else if("showAll".equals(method)) {
			showAll(request,response);
		}else if("deal".equals(method)) {
			deal(request,response);
		}else if("showOne".equals(method)){
			showOne(request,response);
		}else if("edit".equals(method)) {
			edit(request,response);
		}
	}


	private void edit(HttpServletRequest request, HttpServletResponse response) {
		MoveService service = new MoveServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Move move = service.showOne(id);
			request.setAttribute("move", move);
			request.getRequestDispatcher("/deal.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void showOne(HttpServletRequest request, HttpServletResponse response) {
		MoveService service = new MoveServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Move move = service.showOne(id);
			request.setAttribute("move", move);
			request.getRequestDispatcher("/getbyid.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void deal(HttpServletRequest request, HttpServletResponse response) {
		MoveService service = new MoveServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		String area = request.getParameter("area");
		String cartype = request.getParameter("cartype");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date movedate = f.parse(request.getParameter("movedate"));
			String contact = request.getParameter("contact");
			String phone = request.getParameter("phone");
			int status = Integer.parseInt(request.getParameter("status"));
			Move move = new	Move(id, area, cartype, movedate, contact, phone, status);
			
			try {
				int n = service.deal(move);
				if(n == 1) {
					response.sendRedirect(request.getContextPath()+"/MoveServlet?method=showAll");	
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		
		
		}

	private void showAll(HttpServletRequest request, HttpServletResponse response) {
		MoveService service = new MoveServiceImpl();
		try {
			List<Move> list = service.showAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/getall.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void regist(HttpServletRequest request, HttpServletResponse response) {
		MoveService service = new MoveServiceImpl();
		String area = request.getParameter("area");
		String cartype = request.getParameter("cartype");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date movedate = f.parse(request.getParameter("movedate"));
			String contact = request.getParameter("contact");
			String phone = request.getParameter("phone");
			int status = Integer.parseInt(request.getParameter("status"));
			try {
				Move move = new Move(area, cartype, movedate, contact, phone, status);
				int n = service.regist(move);
				if(n == 1) {
					response.sendRedirect(request.getContextPath()+"/MoveServlet?method=showAll");
				}else {
					//request.getRequestDispatcher("/error.jsp").forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
