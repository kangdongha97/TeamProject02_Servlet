package ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteServlet() {
        super();
        System.out.println("생성자 콜");
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		response.setContentType("text/HTML; charset=UTF-8"); // 한글설정
		PrintWriter out = response.getWriter(); // html 객체를 만들 수 있는 객체를 생성
		
		out.println(
			"<html>" + 
				"<body>" + 
					"<h1>삭제되었습니다.</h1>" +
				"</body>" + 
			"</html>"

		);

		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}