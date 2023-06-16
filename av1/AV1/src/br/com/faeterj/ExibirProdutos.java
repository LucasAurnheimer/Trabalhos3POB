package br.com.faeterj;

import java.util.List;

public class ExibirProdutos {

	public void exibir(List<Produto> lProdutos) {
        if (lProdutos.isEmpty()) {
            System.out.println("A lista de produtos está vazia.");
        } else {
            System.out.println("Todos os produtos registrados:");
            for (Produto produto : lProdutos) {
                System.out.println(produto);
            }
        }
    }
	
}
