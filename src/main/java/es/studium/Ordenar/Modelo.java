package es.studium.Ordenar;

import java.util.ArrayList;
import java.util.Collections;

public class Modelo {
	Modelo(){}
	
	static ArrayList<Integer> ordenarDeMayorAMenor(ArrayList<Integer> original) {
        ArrayList<Integer> numerosOrdenados = new ArrayList<>(original);
        Collections.sort(numerosOrdenados, Collections.reverseOrder());

        return numerosOrdenados;
    }
	
	static String generarRespuestaError() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Práctica 3 DAW</title>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">" +
                "<link rel=\"icon\" type=\"image/x-icon\" href=\"Favicon.jpg\">" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "<h1>Error</h1>" +
                "<p>¡ERROR! Por favor, ingresa números separados por comas</p>" +
                "<form action=\"index.html\">" +
                "<input type=\"submit\" value=\"Volver al Inicio\"/>" +
                "</form>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}
