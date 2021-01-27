package org.trabLanchonete.lanchonete.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PedidoController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void redirect(HttpServletResponse httpResponse) throws Exception {

	     httpResponse.sendRedirect("/trabLanchonete");
	}
	
}

