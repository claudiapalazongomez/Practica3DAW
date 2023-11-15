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
}
