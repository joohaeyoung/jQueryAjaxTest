package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet({ "/Add", "/add" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. 입력받고 (무조건 스트링으로 받음)
		String input1=request.getParameter("first");
		String input2=request.getParameter("second");
		
		//2. 로직처리하고
		int result = Integer.parseInt(input1)+Integer.parseInt(input2);
		
		//3. 출력하고
		
		response.setContentType("text/html; charset=utf8 ");
		//3-2 출력하기 위한 데이터연결통로인 stream을 만들어요.
		PrintWriter out = response.getWriter();
		//3-3연결 통로를 통해서 데이터를 클라이언트에게 전달
		
		
		out.println(result);
		//3-4에이터 출력을 정확히 처리하기위해 flush 작업을 해요!!
		out.flush();
		//3-5사용된 자원 해제
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
