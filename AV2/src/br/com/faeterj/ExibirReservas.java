package br.com.faeterj;

import java.util.List;

public class ExibirReservas {

	public void exibir(List<Reserva> lReservas) {
        if (lReservas.isEmpty()) {
            System.out.println("A lista de Reservas está vazia.");
        } else {
            System.out.println("Todos os Reservas registradas:");
            for (Reserva Reserva : lReservas) {
                System.out.println(Reserva);
            }
        }
    }
}
