package org.trabLanchonete.lanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("fornecedor")
	public String fornecedorForm() {
		return "fornecedor";
	}
	
}
