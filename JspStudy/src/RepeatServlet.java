

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RepeatServlet
 */
@WebServlet("/RepeatServlet")
public class RepeatServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
