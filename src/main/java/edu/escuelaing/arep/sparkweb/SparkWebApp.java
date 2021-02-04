package edu.escuelaing.arep.sparkweb;

/**
 * @Autor Juan Romero
 *
 */
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.port;

import java.util.HashMap;
import java.util.Map;

import edu.escuelaing.arep.Likend.LikendList;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkWebApp {
   
    public static void main(String[] args) {
    	LikendList<Double> lista1 = new LikendList<Double>();
        port(getPort());
        get("/hello", (req, res) -> "<input/><button>ingrese lista de numeros</button>"); 
       
    }
  
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}