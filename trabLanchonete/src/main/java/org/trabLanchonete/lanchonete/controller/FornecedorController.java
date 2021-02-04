package org.trabLanchonete.lanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.trabLanchonete.lanchonete.model.Fornecedor;
import org.trabLanchonete.lanchonete.repositorio.FornecedorRepositorio;

@Controller
public class FornecedorController {
	private Fornecedor fornecedor;
	private FornecedorRepositorio repositorio;
	
	@Autowired
	public FornecedorController(Fornecedor fornecedor, FornecedorRepositorio repositorio) {
		super();
		this.fornecedor = fornecedor;
		this.repositorio = repositorio;
	}
	
	@Transactional
	@RequestMapping("fornecedor")
	public String fornecedorForm() {
		return "fornecedor";
	}
	@RequestMapping("adicionarFornecedor")
	public String adicionarFornecedor(int numero) {
		repositorio.cadastrar(repositorio.getFornecedor(numero));
		return "redirect:listarFornecedor";
	}
	
	@RequestMapping("listarFornecedor")
	public String getFornecedor(Model model) {
		model.addAttribute("fornecedor", repositorio.getFornecedor());
		return "lanches";
	}
	
	@RequestMapping("listarLanches")
	public String getPedidos(Model model) {
		model.addAttribute("lanche", repositorio.getLanches());
		return "lanche";
	}
}
