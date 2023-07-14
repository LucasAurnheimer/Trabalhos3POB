package br.com.faeterj;

import java.util.Scanner;

public class InserirQuarto {

public Quarto obterDadosQuarto() {
	
		
        // Criação de um objeto Scanner para ler os dados do Quarto
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os dados do Quarto: ");
        int id = Main.ultimoIdQuarto;
        
        System.out.println("Digite o nomeQuarto do Quarto: ");
        String nomeQuarto = scanner.nextLine();
       
        System.out.println("Digite o endereço do Quarto: ");
        int qtdCamas = scanner.nextInt();
       
        
        System.out.println("Digite o código postal do Quarto: ");
        boolean temBanheiro = scanner.nextBoolean();
        
        
        System.out.println("Digite o país do Quarto: ");
        String descricao = scanner.nextLine();
        
;
        
        // Instanciação de um novo objeto Quarto com os dados fornecidos
        Quarto quarto = new Quarto(id, nomeQuarto, qtdCamas, temBanheiro, descricao);

        quarto.setId(id);
		quarto.setNomeQuarto(nomeQuarto);
		quarto.setQtdeCamas(qtdCamas);
        quarto.setTemBanheiro(temBanheiro);
        quarto.setDescricao(descricao);
       
        
        return quarto;
    }
}
