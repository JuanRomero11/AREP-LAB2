package edu.escuelaing.arep.sparkweb;

/**
 * @Autor Juan Romero
 *
 */

import static spark.Spark.*;

public class SparkWebApp {
   
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "hello heroku");   

    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}