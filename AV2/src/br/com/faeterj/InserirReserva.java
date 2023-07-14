package br.com.faeterj;

import java.util.Scanner;

public class InserirReserva {

	public Reserva obterDadosReserva() {
		
	// Criação de um objeto Scanner para ler os dados do reserva
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite os dados da reserva: ");
    int id = Main.ultimoIdReserva;
    System.out.println("Digite o id do cliente: ");
    int idCliente = scanner.nextInt();
    
    System.out.println("Digite o id do quarto: ");
    int idQuarto = scanner.nextInt();
    
    System.out.println("Digite o id da cama: ");
    int idCama = scanner.nextInt();
    
    System.out.println("Digite a data da reserva: ");
    String dataEntrada = scanner.nextLine();
    
    System.out.println("Digite a data do fim da reserva: ");
    String dataSaida = scanner.nextLine();
    
    // Instanciação de um novo objeto Reserva com os dados fornecidos
    Reserva reserva = new Reserva(id, idCliente, idQuarto, idCama, dataEntrada, dataSaida);
    

    reserva.setId(id);
	reserva.setIdCliente(idCliente);
	reserva.setIdQuarto(idQuarto);
    reserva.setIdCama(idCama);
    reserva.setDataEntrada(dataEntrada);
    reserva.setDataSaida(dataSaida);
    
    
    return reserva;
    }
}

