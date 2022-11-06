package midterm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Responsepost
 */
public class Responsepost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Responsepost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		String[] c= request.getParameterValues("acesstories");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println(
				"<!doctype html public \"-//W3C//TDT HTML 4.0 Transitional//EN \">\n"
				+"<html>\n"
				+"<head>\n"
				+"<title>midterm</title>\n"
				+"<head>\n"
				+"<body>\n"
				+"<style>\r\n"
				+ "	table,th,td{\r\n"
				+ "		border: solid black 1px;\r\n"
				+ "		box-shadow: 1px 1px 1px grey;\r\n"
				+ "		}\r\n"
				+ "	body{\r\n"
				+ "		display:flex;\r\n"
				+ "		justify-content: center;\r\n"
				+ "		align-items: center;\r\n"
				+ "		}"
				+ "div{"
				+ "	display:block;"
				+ "}"
				+ "</style>"
				+"<div><h1>Order Summary:</h1><div>"
				+"<table>"
				+"<tr>"
				+"	<td>"
				+"	 	Processor:"
				+"	</td>"
				+"	<td>"
				+ a
				+"	</td>"
				+"	</tr>"
				+"<tr>\n"
				+"	<td>\n"
				+"		Acesstories:\n"	
				+"	</td>\n"
				+"	<td>\n");
		
				 if(b!=null){ out.print(b+"<br>\n"); }
				 if(c!=null){ for(int i=0;i<c.length;i++){ if(c[i]!=null){ out.print(c[i]+"<br>\n");} } }
						
		out.println(
				"	</td>\n"
				+"</tr>\n"
				+"</table>\n"
				+"</body>\n"
				+"</html>\n");
		
	}

}
