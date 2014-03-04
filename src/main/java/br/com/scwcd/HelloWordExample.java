package br.com.scwcd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWordExample extends HttpServlet {

	@SuppressWarnings("rawtypes")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body bgcolor=\"white\">");
		out.println("<h1>Primeiro Servlet</h1>");
		out.println("</body>");
		out.println("</html>");

		// Parametros
		PrintWriter o = response.getWriter();

		Enumeration e = request.getParameterNames();

		while (e.hasMoreElements()) {
			String nome = (String) e.nextElement();
			String valor = request.getParameter(nome);
			o.println(nome + ": " + valor);
		}

	}

}
