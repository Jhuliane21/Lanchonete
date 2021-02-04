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
	@RequestMapping("adicionarIngrediente")
	public String adicionarIngrediente(int numero) {
		repositorio.cadastrar(repositorio.getIngrediente(numero));
		return "redirect:listarLanches";
	}
	@RequestMapping("listarIngrediente")
	public String getIngrediente(Model model) {
		model.addAttribute("ingrediente", repositorio.getIngrediente());
		return "ingrediente";
	}
	
	@RequestMapping("listarIngredientes")
	public String getIngredientes(Model model) {
		model.addAttribute("ingrediente", repositorio.getIngredientes());
		return "ingredientes";
	}
	
	@RequestMapping("removerIngrediente")
	public String removerIngrediente(Ingrediente ingrediente) {
		repositorio.excluir(ingrediente);
		return "redirect:listarIngredientes";
	}
}
