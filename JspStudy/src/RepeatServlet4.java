

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
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();
	      //���尴ü request ,response(����)->������(html����)
	      String msg=request.getParameter("msg");//�ȳ��ϼ���?
	      /*
	      String num=request.getParameter("number");//"5"
	      int number=Integer.parseInt(num);//"5"->5
	      */
	      int number=Integer.parseInt(request.getParameter("number"));
	      System.out.println("msg=>"+msg+",number=>"+number);
	      
	      int count=0;//�ݺ��� Ƚ��
	      while(number > count){ 
	    	 out.println("<b>"+msg+"</b><br>");
	    	  count++;
	      }
	}
	}


