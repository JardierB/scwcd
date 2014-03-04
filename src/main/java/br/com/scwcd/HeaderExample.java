package br.com.scwcd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HeaderExample extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		PrintWriter out = res.getWriter();
		String strAcc = req.getHeader("Accept-Encoding");
		
		res.setHeader("Content-Encoding", "ISO-8859-1");
		res.setHeader("Content-Type", "txt/html");
		
		out.println("<html><body><title>Teste de Header</title>");
		out.println("Aceita: " + strAcc);
		out.println("</body></html>");
		out.close();
		
		res.sendRedirect("/teste.html");
		
	}

}
