package br.com.faeterj;

import java.util.List;
import java.util.Scanner;

public class AlterarReserva {

	public static void  alterarReserva(int id, List<Reserva> LReserva) {
        Scanner scanner = new Scanner(System.in);

     
        Reserva ReservaEncontrado = buscarReservaPorId(id, LReserva);

        if (ReservaEncontrado != null) {
            System.out.println("Reserva encontrada:");

            System.out.println("\nDigite as novas informações da Reserva:");

            System.out.println("ID CLIENTE: ");
            int nomeidCliente = scanner.nextInt();
            ReservaEncontrado.setIdCliente(nomeidCliente);

            System.out.println("iD QUARTO: ");
            int idQuarto = scanner.nextInt();
            ReservaEncontrado.setIdQuarto(idQuarto);

            System.out.println("ID CAMA: ");
            int idCama = scanner.nextInt();
            ReservaEncontrado.setIdCama(idCama);
            
            System.out.println("DATA ENTRADA: ");
            String dataEntrada = scanner.nextLine();
            ReservaEncontrado.setDataEntrada(dataEntrada);
            
            System.out.println("DATA SAIDA: ");
            String dataSaida = scanner.nextLine();
            ReservaEncontrado.setDataSaida(dataSaida);

        
        } else {
            System.out.println("Reserva não encontrada.");
        }

        
     
        scanner.close();
    }
    
    private static Reserva buscarReservaPorId(int id, List<Reserva> listaReservas) {
        for (Reserva Reserva : listaReservas) {
            if (Reserva.getId() == id) {
                return Reserva;
            }
        }
        return null;
}
}
