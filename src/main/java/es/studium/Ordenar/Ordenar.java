package es.studium.Ordenar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Media
 */
@WebServlet("/Ordenar")
public class Ordenar extends HttpServlet {
	Modelo modelo = new Modelo();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ordenar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeros = request.getParameter("numeros");
		if (!numeros.matches("^\\s*-?\\d+(\\s*,\\s*-?\\d+)*\\s*$")) {
			String respuestaError = Modelo.generarRespuestaError();
			response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println(respuestaError);
	        return;
	    }
		ArrayList<Integer> original = new ArrayList<Integer>();
		String[] tablaNumeros = numeros.split("\\s*,\\s*");
		for(String numero: tablaNumeros)
		{
		original.add(Integer.parseInt(numero.trim()));
		}
		ArrayList<Integer> numerosOrdenados = Modelo.ordenarDeMayorAMenor(original);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Título de tu Página</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Lista Ordenada de Mayor a Menor</h1>");
        out.println("<div class=\"result\">La lista ordenada de mayor a menor es: " + numerosOrdenados + "</div>");
        out.println("<form action=\"index.html\">");
        out.println("<input type=\"submit\" value=\"Volver al Inicio\"/>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
