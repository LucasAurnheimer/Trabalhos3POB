package br.com.faeterj;

import java.util.List;

public class ExibirProduto {
    public void exibirProduto(int id, List<Produto> lProdutos) {
        boolean produtoEncontrado = false;
        
        for (Produto produto : lProdutos) {
            if (produto.getId() == id) {
                System.out.println("Detalhes do Produto:");
                System.out.println("ID: " + produto.getId());
                System.out.println("CodigoDeBarras: " + produto.getCodigoDeBarras());
                System.out.println("Sku: " + produto.getSku());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descricao: " + produto.getDescricao());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Preco: " + produto.getPreco());
                System.out.println("Peso: " + produto.getPeso());
                System.out.println("Fabricante: " + produto.getFabricante());
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}