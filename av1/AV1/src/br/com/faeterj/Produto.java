package br.com.faeterj;

public class Produto {
	
	private int id;
	
	private int codigoDeBarras;
	
	private int sku;
	
	private String nome;
	
	private String descricao;
	
	private String categoria;
	
	private double preco;
	
	private double peso;
	
	private String fabricante;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Produto(int id, int codigoDeBarras, int sku, String nome, String descricao, String categoria, double preco,
			double peso, String fabricante) {

		this.id = id;
		this.codigoDeBarras = codigoDeBarras;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}

	


}
