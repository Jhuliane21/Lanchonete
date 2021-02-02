
public class Ingrediente {
	private Double codigo;
	private String nome;
	private Fornecedor fornecedor;
	
	public Cliente() {
		
	}
	
	
	public Cliente( Double codigo, String nome, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fornecedor = fornecedor;
		
	}
	
	public String getCodigoIngrediente() {
		return codigo;
	}
	public void setCodigoIngrediente(String codigoIngrediente) {
		this.codigo = codigoIngrediente;
	}
	public String getNomeIngrediente() {
		return nome;
	}
	public void setNomeIngrediente(String NomeIngrediente) {
		this.nome = NomeIngrediente;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedorIngrediente(String FornecedorIngrediente) {
		this.fornecedor = FornecedorIngrediente;
	}
}
