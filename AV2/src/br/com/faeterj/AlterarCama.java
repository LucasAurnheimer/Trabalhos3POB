package br.com.faeterj;

import java.util.List;
import java.util.Scanner;

public class AlterarCama {

	public void  alterarCama(int id, List<Cama> LCama) {
        Scanner scanner = new Scanner(System.in);

     
        Cama CamaEncontrada = buscarCamaPorId(id, LCama);

        if (CamaEncontrada != null) {
            System.out.println("Cama encontrado:");

            System.out.println("\nDigite as novas informações da Cama:");

            System.out.println("codigoCama: ");
            String codigoCama = scanner.nextLine();
            CamaEncontrada.setCodigoCama(codigoCama);

            System.out.println("Endereço: ");
            String posicao = scanner.nextLine();
            CamaEncontrada.setPosicao(posicao);

            System.out.println("Código Postal: ");
            String descricao = scanner.nextLine();
            CamaEncontrada.setDescricao(descricao);

        
        } else {
            System.out.println("Cama não encontrada.");
        }

        
     
        scanner.close();
    }
    
    private static Cama buscarCamaPorId(int id, List<Cama> listaCamas) {
        for (Cama Cama : listaCamas) {
            if (Cama.getId() == id) {
                return Cama;
            }
        }
        return null;
}
}
