package br.com.faeterj;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Produto> lProduto = new ArrayList();
		int count = 1;
		Scanner sc = new Scanner(System.in);
	   // Produto produtos[] = new Produto[count];
		
		System.out.println("Digite os campos do produto a seguir");
		int id = count;
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
		
		
		Produto prod = new Produto(id,codigoDeBarras,sku,nome,descricao,categoria,preco,peso,fabricante);
		lProduto.add(prod);
		count++;
		System.out.println("Produto referente ao dados: Id: " + prod.getId() + " CodigoDeBarras: " + prod.getCodigoDeBarras() + " sku: " + 
		prod.getSku() + " Nome: "  + prod.getNome() + " Descricao: " + prod.getDescricao() + " Categoria: " + prod.getCategoria() + " preco: "
		+ prod.getPreco() + " peso: " + prod.getPeso() + " fabricante: " + prod.getFabricante() + "adicionado a lista");		
		
		
	
		
			
			
		
		
		
		

	}

}
