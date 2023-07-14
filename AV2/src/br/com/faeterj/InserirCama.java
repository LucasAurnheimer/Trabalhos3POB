package br.com.faeterj;

import java.util.Scanner;

public class InserirCama {

public Cama obterDadoscama() {
	
		
        // Criação de um objeto Scanner para ler os dados do cama
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os dados da cama: ");
        int id = Main.ultimoIdCama;
        
        System.out.println("Digite o código da cama: ");
        String codigoCama = scanner.nextLine();
        
        System.out.println("A cama é beliche? (true/false): ");
        boolean ehBeliche = scanner.nextBoolean();
        scanner.nextLine();
        
        System.out.println("Digite a posição da cama: ");
        String posicao = scanner.nextLine();
        
        System.out.println("Digite a descrição da cama: ");
        String descricao = scanner.nextLine();
        
        // Instanciação de um novo objeto Cama com os dados fornecidos
        Cama cama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);
        

        cama.setId(id);
		cama.setCodigoCama(codigoCama);
		cama.setEhBeliche(ehBeliche);
        cama.setPosicao(posicao);
        cama.setDescricao(descricao);
        
        
        return cama;
    }
}
