package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. @WebServlet("/hello") ���� �����ּ�
//2. Ŭ���� �̸� ����
//3. ������ �̸� ����
@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public RegistServlet() {
      super();
      System.out.println("������ ��");
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");
		response.setContentType("text/HTML; charset=UTF-8"); // �ѱۼ��� PrintWriter out
		PrintWriter out = response.getWriter(); // html ��ü�� ���� �� �ִ� ��ü�� ���� out.println("<html>");
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		out.println("<head>"); 
		out.println("</head>");

		out.println("<body>"); 
		out.println("<h1>" + id + " ���Ե�" + "</h1>");
		out.println("</body>"); 
		out.println("</html>"); 

		out.close();

	}

}