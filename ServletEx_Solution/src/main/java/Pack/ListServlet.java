package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. @WebServlet("/hello") 변경 입장주소
//2. 클래스 이름 변경
//3. 생성자 이름 변경
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public ListServlet() {
      super();
      System.out.println("생성자 콜");
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list doget");
		
		String[] id = new String[] {"독수리", "호랑이", "강아지"};

		response.setContentType("text/HTML; charset=UTF-8"); // 한글설정
		PrintWriter out = response.getWriter(); // html 객체를 만들 수 있는 객체를 생성

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");

		out.println("<body>");

		out.println("<table border='1' width='300'>");
		out.println("<tr>");
		out.println("<td>아이디</td>");
		out.println("<td>삭제</td>");
		out.println("<td>수정</td>");
		out.println("</tr>");


		for (int i = 0; i < 3; i++) { 
			out.println("<tr>");
			out.println("<th>" + id[i] + "</th>");
			out.println("<td><a href='delete?id=" + id[i] + "'>삭제</a></td>");
			out.println("<td><a href='update?id=" + id[i] + "'>수정</a></td>");
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