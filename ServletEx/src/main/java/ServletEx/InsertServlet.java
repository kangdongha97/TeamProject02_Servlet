package ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		String id = request.getParameter("id");
		System.out.println(id);
		response.setContentType("text/HTML; charset=UTF-8"); // 한글설정
		PrintWriter out = response.getWriter(); // html 객체를 만들 수 있는 객체를 생성
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			//out.println("<h1>"+ id  + "</h1>");
			out.println(id + "님 ! 성공적으로 가입되었습니다.");
			out.println("</body>");
		out.println("</html>");

		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
