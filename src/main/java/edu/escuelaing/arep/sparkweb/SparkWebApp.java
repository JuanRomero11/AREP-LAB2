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
	
   

	
	public static void main (String[]args){

        port(getPort());
        get("/inputdata",(req,res) -> inputDataPage(req,res));
        get("/resultados",(req,res) -> resultDataPage(req,res));
        
        
	}

	private static String inputDataPage(Request req, Response res) {
		String pageC
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
		return pageC;
	}
	

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

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}