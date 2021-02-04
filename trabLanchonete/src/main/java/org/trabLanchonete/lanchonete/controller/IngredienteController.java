package org.trabLanchonete.lanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.trabLanchonete.lanchonete.model.Ingrediente;
import org.trabLanchonete.lanchonete.repositorio.IngredienteRepositorio;

@Controller
public class IngredienteController {
	private Ingrediente ingrediente;
	private IngredienteRepositorio repositorio;
	
	@Autowired
	public IngredienteController(Ingrediente ingrediente, IngredienteRepositorio repositorio) {
		super();
		this.ingrediente = ingrediente;
		this.repositorio = repositorio;
	}	
	
}
