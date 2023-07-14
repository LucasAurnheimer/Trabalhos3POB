package br.com.faeterj;

import java.util.List;

public class ExibirCamas {

	public void exibir(List<Cama> lCamas) {
        if (lCamas.isEmpty()) {
            System.out.println("A lista de Clientes está vazia.");
        } else {
            System.out.println("Todos os Clientes registrados:");
            for (Cama Cama : lCamas) {
                System.out.println(Cama);
            }
        }
    }
}
