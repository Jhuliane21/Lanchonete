package org.trabLanchonete.lanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.trabLanchonete.lanchonete.model.Lanche;
import org.trabLanchonete.lanchonete.repositorio.LancheRepositorio;

@Controller
public class LancheController {
	private LancheRepositorio repositorio;
	private Lanche lanche;
	
	@Autowired
	public LancheController(LancheRepositorio repositorio, Lanche lanche) {
		super();
		this.repositorio = repositorio;
		this.lanche = lanche;
	}
	
//	@RequestMapping("listarLanche")
//	public String getLanchesLanchonete(Model model) {
//		model.addAttribute("lanches", repositorio.getLanche());
//		return "lanches";
//	}
	
	@RequestMapping("listarLanches")
	public String getPedidos(Model model) {
		model.addAttribute("lanche", repositorio.getLanches());
		return "lanche";
	}
	
	@RequestMapping("adicionarLanche")
	public String adicionarPedido(int numero) {
		repositorio.cadastrar(repositorio.getLanche(numero));
		return "redirect:listarLanches";
	}
	
	@RequestMapping("removerLanche")
	public String removerLanche(Lanche lanche) {
		repositorio.excluir(lanche);
		return "redirect:listarLanches";
	}
}
