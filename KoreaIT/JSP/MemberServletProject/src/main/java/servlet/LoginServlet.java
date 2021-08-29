
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MemberDTO;
import service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		MemberDTO dto = MemberService.getInstance().login(id, pass);
		
		if(dto != null) {
			//로그인 성공 했을때
			session.setAttribute("obj", dto);
			ArrayList<MemberDTO> list = MemberService.getInstance().selectAllMember();
			session.setAttribute("list", list);
			response.sendRedirect(request.getContextPath()+"/main.jsp");
		}else {
			out.print("<script>");
			out.print("alert('로그인 실패, 아이디 비번 확인하세요');");
			out.print("history.back();");
			out.print("</script>");
		}
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}