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
@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public RegistServlet() {
      super();
      System.out.println("생성자 콜");
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");
		response.setContentType("text/HTML; charset=UTF-8"); // 한글설정 PrintWriter out
		PrintWriter out = response.getWriter(); // html 객체를 만들 수 있는 객체를 생성 out.println("<html>");
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		out.println("<head>"); 
		out.println("</head>");

		out.println("<body>"); 
		out.println("<h1>" + id + " 가입됨" + "</h1>");
		out.println("</body>"); 
		out.println("</html>"); 

		out.close();

	}

}