package br.com.faeterj;

import java.util.List;

public class ExibirQuartos {

	public void exibir(List<Quarto> lQuartos) {
        if (lQuartos.isEmpty()) {
            System.out.println("A lista de Clientes está vazia.");
        } else {
            System.out.println("Todos os Clientes registrados:");
            for (Quarto Quartos : lQuartos) {
                System.out.println(Quartos);
            }
        }
    }
}
