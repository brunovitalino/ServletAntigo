import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Falar extends HttpServlet
{
	
	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html5>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Fale Conosco</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Olaa!");
		out.println("<fieldset>");
		out.println("<legend>Deixe sua mensagem</legend>");
		out.println("<label for =\"Nome\">Nome: </label>");
		out.println("<input type=\"text\" id=\"Nome\" placeholder=\"Nome\">");
		out.println("<br>");
		out.println("<label for =\"Telefone\">Telefone: </label>");
		out.println("<input type=\"text\" id=\"Telefone\" placeholder=\"Telefone\">");
		out.println("<br>");
		out.println("<label for =\"Mensagem\"></label>");
		out.println("<textarea cols=60 id=\"Mensagem\" rows=\"10\" name=\"opiniao\" maxlength=\"500\" wrap=\"hard\" placeholder=\"Mensagem\"></textarea>");
		out.println("</fieldset>");	
		out.println("</body>");
		out.println("</html>");
	}

}
