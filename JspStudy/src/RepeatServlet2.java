

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
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//��ü ���� 3��° ���
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		//abc/while.jsp���� ó���� ������ �״�� �����ϸ� ��
		  request.setCharacterEncoding("utf-8");
	      //���尴ü request ,response(����)->������(html����)
	      String msg=request.getParameter("msg");//�ȳ��ϼ���?
	      
	      int number=Integer.parseInt(request.getParameter("number"));
	      System.out.println("msg=>"+msg+",number=>"+number);
	      
	      int count=0;//�ݺ��� Ƚ��
	      while(number > count){ 
	    	 out.println(msg+"<br>");
	    	  count++;
	      }
		out.println("</body></html>");
	}

}
