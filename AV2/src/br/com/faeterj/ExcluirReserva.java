package br.com.faeterj;

import java.util.List;

public class ExcluirReserva {

	public void excluirReserva(int id, List<Reserva> lReservas) {
        boolean ReservaEncontrado = false;
        
        for (Reserva Reserva : lReservas) {
            if (Reserva.getId() == id) {
                lReservas.remove(Reserva);
                ReservaEncontrado = true;
                System.out.println("Reserva removida com sucesso.");
                break;
            }
        }

        if (!ReservaEncontrado) {
            System.out.println("Reserva não encontrada.");
        }
    }
}
