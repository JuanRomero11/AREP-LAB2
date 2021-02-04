/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.calculator;

import java.util.List;

/**
 *
 * @author Juan Romero
 */
public class calculator {
    /**
	 * La funcion del metodo es basicamente retornar la media de los datos de una
	 * lista encadenada.
	 * 
	 * @param lista1 donde corresponde a una lista encadenada tipo LikendListPropio
	 *               en la cual estan almecenados todos los datos del archivo leido
	 * @return Double media de la lista de datos
	 */
	public static Double calcularMedia(List<Double> lista1) {
                Double suma =0.0;
               for(Double x:lista1){
                    suma += x;
                }
		return suma / lista1.size();
	}

	/**
	 * La funcion de este metodo es retornar la desviacion de una lista de datos.
	 * 
	 * @param lista1 donde corresponde a una lista de datos de tipo Double.
	 * @return Double media de la lista de datos
	 */ 
	public static Double calcularDesviacion(List<Double> lista1) {
		Double calculo = 0.0;
		Double media = calcularMedia(lista1);
		int n = lista1.size();
		for (int i = 0; i < n; i++) {
			calculo += (double) Math.pow((lista1.get(i) - media), 2);

		}
		return (Double) Math.sqrt(calculo / (n - 1));
	}
}
