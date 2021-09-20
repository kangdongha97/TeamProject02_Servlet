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
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		
		//String[] person = new String []{"홍길동", "강동하", "김경도"};
		LinkedList<String> people = new LinkedList<String>();
		people.add("홍길동");
		people.add("강동하");
		people.add("김경도");
		
		response.setContentType("text/HTML; charset=UTF-8"); // 한글설정
		PrintWriter out = response.getWriter(); // html 객체를 만들 수 있는 객체를 생성
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
					out.println("<th><a href=\"delete\">삭제</a></th>");
					out.println("<th><a href=\"update\">수정</a></th>"); 
					out.println("</tr>");
				}

				/*
				 * for (int i = 0; i < person.length; i++) { out.println("<tr>");
				 * out.println("<th>" + person[i] + "</th>");
				 * out.println("<th><a href=\"delete\">삭제</a></th>");
				 * out.println("<th><a href=\"update\">수정</a></th>"); out.println("</tr>");
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
