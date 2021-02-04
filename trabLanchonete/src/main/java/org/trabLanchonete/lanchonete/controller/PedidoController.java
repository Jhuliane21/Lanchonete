package org.trabLanchonete.lanchonete.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabLanchonete.lanchonete.model.Pedido;
import org.trabLanchonete.lanchonete.repositorio.PedidoRepositorio;

@Controller
public class PedidoController {
	
	private PedidoRepositorio repositorio;
	private Pedido pedido;
	
	@Autowired
	public PedidoController(PedidoRepositorio repositorio, Pedido pedido) {
		super();
		this.repositorio = repositorio;
		this.pedido = pedido;
	}
	
//	@RequestMapping("listarPedidosCliente")
//	public String getProdutosLanchonete(Model model) {
//		model.addAttribute("pedido", repositorio.getPedido());
//		return "cardapio";
//	}
	
//	@RequestMapping("listarPedidos")
//	public String getPedidos(Model model) {
//		model.addAttribute("pedido", carrinho.getPedidos());
//		return "pedido";
//	}
//	
//	@RequestMapping("adicionarPedido")
//	public String adicionarPedido(int codigo) {
//		carrinho.adicionar(repositorio.getPedido(codigo));
//		return "redirect:listarPedidos";
//	}
//	
//	@RequestMapping("removerPedido")
//	public String removerPedido(int codigo) {
//		carrinho.removerPedido(codigo);
//		return "redirect:listarPedidos";
//	}
//	
	
}

