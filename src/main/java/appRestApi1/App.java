package appRestApi1;


import appRestApi1.br.com.ticket.controller.IndexController;
import appRestApi1.br.com.ticket.util.*;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;




public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//handle home pages routes
		get(Path.route.HOME,(req,res) -> IndexController.HOMEPAGE(req, res),new ThymeleafTemplateEngine());
		
		//handle login routes
		
		
		//handle crud routes

	}

}
