package ServletEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		
		//String[] person = new String []{"ȫ�浿", "������", "��浵"};
		LinkedList<String> people = new LinkedList<String>();
		people.add("ȫ�浿");
		people.add("������");
		people.add("��浵");
		
		response.setContentType("text/HTML; charset=UTF-8"); // �ѱۼ���
		PrintWriter out = response.getWriter(); // html ��ü�� ���� �� �ִ� ��ü�� ����
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table border='1' width='200'>");
				out.println("<tr>");
					out.println("<th>name</th>");
					out.println("<th>delete</th>");
					out.println("<th>update</th>");
				out.println("</tr>");
				
				for (String s : people) { 
					out.println("<tr>");
					out.println("<th>" + s + "</th>");
					out.println("<th><a href=\"delete\">����</a></th>");
					out.println("<th><a href=\"update\">����</a></th>"); 
					out.println("</tr>");
				}

				/*
				 * for (int i = 0; i < person.length; i++) { out.println("<tr>");
				 * out.println("<th>" + person[i] + "</th>");
				 * out.println("<th><a href=\"delete\">����</a></th>");
				 * out.println("<th><a href=\"update\">����</a></th>"); out.println("</tr>");
				 * 
				 * }
				 */
				
			out.println("</table>");
			out.println("</body>");
		out.println("</html>");

		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
