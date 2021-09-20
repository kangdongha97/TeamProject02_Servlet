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
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public ListServlet() {
      super();
      System.out.println("������ ��");
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list doget");
		
		String[] id = new String[] {"������", "ȣ����", "������"};

		response.setContentType("text/HTML; charset=UTF-8"); // �ѱۼ���
		PrintWriter out = response.getWriter(); // html ��ü�� ���� �� �ִ� ��ü�� ����

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");

		out.println("<body>");

		out.println("<table border='1' width='300'>");
		out.println("<tr>");
		out.println("<td>���̵�</td>");
		out.println("<td>����</td>");
		out.println("<td>����</td>");
		out.println("</tr>");


		for (int i = 0; i < 3; i++) { 
			out.println("<tr>");
			out.println("<th>" + id[i] + "</th>");
			out.println("<td><a href='delete?id=" + id[i] + "'>����</a></td>");
			out.println("<td><a href='update?id=" + id[i] + "'>����</a></td>");
			out.println("</tr>");

		}
		 

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list dopost");
	}

}