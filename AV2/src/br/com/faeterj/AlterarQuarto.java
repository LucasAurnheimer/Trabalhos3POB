package br.com.faeterj;

import java.util.List;
import java.util.Scanner;

public class AlterarQuarto {

	public static void  alterarQuarto(int id, List<Quarto> LQuarto) {
        Scanner scanner = new Scanner(System.in);

     
        Quarto QuartoEncontrado = buscarQuartoPorId(id, LQuarto);

        if (QuartoEncontrado != null) {
            System.out.println("Quarto encontrado:");

            System.out.println("\nDigite as novas informações do Quarto:");

            System.out.println("nomeQuarto: ");
            String nomeQuarto = scanner.nextLine();
            QuartoEncontrado.setNomeQuarto(nomeQuarto);

            System.out.println("Endereço: ");
            int qtdeCamas = scanner.nextInt();
            QuartoEncontrado.setQtdeCamas(qtdeCamas);

            System.out.println("Código Postal: ");
            String descricao = scanner.nextLine();
            QuartoEncontrado.setDescricao(descricao);

        
        } else {
            System.out.println("Quarto não encontrada.");
        }

        
     
        scanner.close();
    }
    
    private static Quarto buscarQuartoPorId(int id, List<Quarto> listaQuartos) {
        for (Quarto Quarto : listaQuartos) {
            if (Quarto.getId() == id) {
                return Quarto;
            }
        }
        return null;
}
}
