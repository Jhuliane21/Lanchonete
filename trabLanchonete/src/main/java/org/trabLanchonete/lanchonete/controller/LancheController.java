
public class LancheController {
	private LancheRepositorio repositorio;
	private Lanche lanche;
	
	@Autowired
	public LancheControle(LancheRepositorio repositorio, Lanche lanche) {
		super();
		this.repositorio = repositorio;
		this.lanche = lanche;
	}
	
	@RequestMapping("listarLanche")
	public String getLanchesLanchonete(Model model) {
		model.addAttribute("lanches", repositorio.getLanche());
		return "lanches";
	}
	
	@RequestMapping("listarLanches")
	public String getPedidos(Model model) {
		model.addAttribute("lanche", carrinho.getLanches());
		return "lanche";
	}
	
	@RequestMapping("adicionarLanche")
	public String adicionarPedido(int numero) {
		carrinho.adicionar(repositorio.getLanche(numero));
		return "redirect:listarLanches";
	}
	
	@RequestMapping("removerLanche")
	public String removerLanche(int numero) {
		Lanches.removerLanche(numero);
		return "redirect:listarLanches";
	}
}
