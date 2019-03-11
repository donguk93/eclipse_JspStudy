

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RepeatServlet2
 */
//@WebServlet("/RepeatServlet2")
public class RepeatServlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//객체 생성 3번째 방법
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		//abc/while.jsp에서 처리한 내용을 그대로 복사하면 끝
		  request.setCharacterEncoding("utf-8");
	      //내장객체 request ,response(응답)->재전송(html문서)
	      String msg=request.getParameter("msg");//안녕하세요?
	      
	      int number=Integer.parseInt(request.getParameter("number"));
	      System.out.println("msg=>"+msg+",number=>"+number);
	      
	      int count=0;//반복할 횟수
	      while(number > count){ 
	    	 out.println(msg+"<br>");
	    	  count++;
	      }
		out.println("</body></html>");
	}

}
