package br.com.faeterj;

import java.util.Scanner;

public class Alterar {
	
    public void alterarProduto(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o novo codigoDeBarras do produto:");
        int codigoDeBarras = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        produto.setCodigoDeBarras(codigoDeBarras);
        
        System.out.println("Digite o SKU nome do produto:");
        int sku = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        produto.setSku(sku);
        
        System.out.println("Digite o novo nome do produto:");
        String nome = scanner.nextLine();
        produto.setNome(nome);
        
        System.out.println("Digite a nova descricao do produto:");
        String descricao = scanner.nextLine();
        produto.setDescricao(descricao);
        
        System.out.println("Digite a nova categoria do produto:");
        String categoria = scanner.nextLine();
        produto.setCategoria(categoria);
        

        System.out.println("Digite o novo preco do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        produto.setPreco(preco);

        System.out.println("Digite o novo peso do produto:");
        double peso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        produto.setPeso(peso);
        
        System.out.println("Digite o novo fabricante do produto:");
        String fabricante = scanner.next();
        scanner.nextLine(); // Limpar o buffer
        produto.setFabricante(fabricante);

        System.out.println("Produto alterado com sucesso!");
        scanner.close();
       
        
        
    }
    
    
}
