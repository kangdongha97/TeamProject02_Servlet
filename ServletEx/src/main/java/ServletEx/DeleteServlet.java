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
        System.out.println("������ ��");
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		response.setContentType("text/HTML; charset=UTF-8"); // �ѱۼ���
		PrintWriter out = response.getWriter(); // html ��ü�� ���� �� �ִ� ��ü�� ����
		
		out.println(
			"<html>" + 
				"<body>" + 
					"<h1>�����Ǿ����ϴ�.</h1>" +
				"</body>" + 
			"</html>"

		);

		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}