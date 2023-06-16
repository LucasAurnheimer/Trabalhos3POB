package br.com.faeterj;

import java.util.List;

public class Excluir {
    public void excluirProduto(int id, List<Produto> lProdutos) {
        boolean produtoEncontrado = false;
        
        for (Produto produto : lProdutos) {
            if (produto.getId() == id) {
                lProdutos.remove(produto);
                produtoEncontrado = true;
                System.out.println("Produto removido com sucesso.");
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}

