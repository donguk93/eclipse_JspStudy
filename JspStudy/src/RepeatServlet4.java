

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RepeatServlet4")
public class RepeatServlet4 extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();
	      //내장객체 request ,response(응답)->재전송(html문서)
	      String msg=request.getParameter("msg");//안녕하세요?
	      /*
	      String num=request.getParameter("number");//"5"
	      int number=Integer.parseInt(num);//"5"->5
	      */
	      int number=Integer.parseInt(request.getParameter("number"));
	      System.out.println("msg=>"+msg+",number=>"+number);
	      
	      int count=0;//반복할 횟수
	      while(number > count){ 
	    	 out.println("<b>"+msg+"</b><br>");
	    	  count++;
	      }
	}
	}


