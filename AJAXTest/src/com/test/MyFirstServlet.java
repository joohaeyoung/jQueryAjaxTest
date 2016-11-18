package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/first")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //클라이언트에서 서버를 호출하면 doGet이 호출된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// --특정내용을 클라이언트에게 전달해준다 --
		//1. 입력받고
		//2. 로직처리하고
		//3. 출력하자
		//3-1. 데이터를 전달하기 전에 어떤 데이타(텍스트,이미지,동영상...)인지 데이터의 종류를 알려준다.
		response.setContentType("text/plain; charset=utf8 ");
		//response.setContentType("img/png;charset=utf8 ");
		
		//3-2 출력하기 위한 데이터연결통로인 stream을 만들어요.
		PrintWriter out = response.getWriter();
		//3-3연결 통로를 통해서 데이터를 클라이언트에게 전달
		out.println("서버로부터 전달된 메시지!!");
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
