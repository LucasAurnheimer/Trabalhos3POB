package br.com.faeterj;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Inserir {

	
	Scanner sc = new Scanner(System.in);
	
	public Produto obterDadosProduto() {
		
		System.out.println("Digite os campos do produto a seguir");
		int id = Main.ultimoId;
		System.out.println("Digite o CODIGO DE BARRAS do produto\n");
		int codigoDeBarras = sc.nextInt();
		System.out.println("Digite o SKU do produto\n");
		int sku = sc.nextInt();
		System.out.println("Digite o NOME do produto\n");
		String nome = sc.next();
		System.out.println("Digite a DESCRIÇÃO do produto\n");
		String descricao = sc.next();
		System.out.println("Digite a CATEGORIA do produto\n");
		String categoria = sc.next();
		System.out.println("Digite o PRECO do produto\n");
		double preco = sc.nextDouble();
		System.out.println("Digite o PESO do produto\n");
		double peso = sc.nextDouble();
		System.out.println("Digite o FABRICANTE do produto\n");
		String fabricante = sc.next();
		
		
		
		Produto produto = new Produto(id, codigoDeBarras, sku, nome, descricao, categoria, preco , peso, fabricante);
		produto.setId(id);
		produto.setCodigoDeBarras(codigoDeBarras);
		produto.setSku(sku);
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setCategoria(categoria);
        produto.setPreco(preco);
        produto.setPeso(peso);
        produto.setFabricante(fabricante);
        

        return produto;
	}
	

	
}
