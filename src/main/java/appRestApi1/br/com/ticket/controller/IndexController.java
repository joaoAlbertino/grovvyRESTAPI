package appRestApi1.br.com.ticket.controller;

import appRestApi1.br.com.ticket.util.Path;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class IndexController {

	public IndexController() {
		// TODO Auto-generated constructor stub
	}
	
	public static ModelAndView HOMEPAGE (Request req , Response res) {
		
		return new ModelAndView(null, Path.template.INDEX);
		
	}

}
