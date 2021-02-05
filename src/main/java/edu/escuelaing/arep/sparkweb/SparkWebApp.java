package edu.escuelaing.arep.sparkweb;

/**
 * @Autor Juan Romero
 *
 */
import static spark.Spark.*;


import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;

import edu.escuelaing.arep.Likend.LikendList;
import edu.escuelaing.arep.calculator.calculator;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkWebApp {
	
   
	/**
	 * Este metodo utiliza metodo get del mini framework spark y funciones lambda
	 * las cuales nos ayudaran a insertar nuestro html y donde obtendremos los datos
	 * ingresados y mostraremos los resultados.
	 * 
	 */
	
	public static void main (String[]args){

        port(getPort());
        get("/inputdata",(req,res) -> inputDataPage(req,res));
        get("/resultados",(req,res) -> resultDataPage(req,res));
        
        
	}
	/**
	 * Se implementa el metodo para leer los datos que ingrese el usuario separados por coma
	 * 
	 * @param req parametro funcion lambda tipo Request
	 * @param res parametro funcion lambda tipo Response
	 * @return pagina 
	 */
	private static String inputDataPage(Request req, Response res) {
		String pagina
			="<!DOCTYPE html>" 
			+"<html>"
			+"<body>" 
			+ "<h1>Calcular media y desviacion estandar</h1>"
			+ "<h2>ingrese los numeros separados por coma </h2>" 
			+ "<form action='/resultados\'>" 
			+ "<input type=\"text\" name='data'>"
			+ "<input type=\"submit\" value=\"calcular\">"  
			+ "</form>" 
			+ "</body>"
			+ "</html>";
		return pagina;
	}
	
	/**
	 * Este metodo mostrara el valor de la media y la desviacion estandar
	 * de los datos ingresados
	 * @param req  parametro funcion lambda tipo Request
	 * @param res parametro funcion lambda tipo Response
	 * @return resp
	 */

	private static String resultDataPage(Request req, Response res) {
		LikendList<Double> lista=new LikendList<Double>();
		String resp;
		String [] valores=req.queryParams("data").split(",");
		for(String i:valores) {
			lista.add(Double.parseDouble(i));
		}
		resp = "<!DOCTYPE html>" 
				+"<html>"
				+"<body>" 
				+ "<h2>"+ "Resultado media: " + calculator.calcularMedia(lista) + "<h2>"
				+ "<h2>"+ "Resultado desviacion estandar: " + calculator.calcularDesviacion(lista) + "<h2>"
				+ "</body>"
				+ "</html>";
		return resp;
	}
	 /**
     *Este metodo se encarga de obtener el puerto segun la variable PORT
     *
     *@return 4657 
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}