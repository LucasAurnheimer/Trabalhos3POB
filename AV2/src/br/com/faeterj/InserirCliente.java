package br.com.faeterj;

import java.util.Scanner;

public class InserirCliente {

	public static void main(String[] args) {
		
		
        // Criação de um objeto Scanner para ler os dados do cliente
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o ID do cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        
        System.out.println("Digite o código postal do cliente: ");
        String postalCode = scanner.nextLine();
        
        System.out.println("Digite o país do cliente: ");
        String pais = scanner.nextLine();
        
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite o número do passaporte do cliente: ");
        String passaporte = scanner.nextLine();
        
        System.out.println("Digite o email do cliente: ");
        String email = scanner.nextLine();
        
        System.out.println("Digite a data de nascimento do cliente: ");
        String dataNascimento = scanner.nextLine();
        
        // Instanciação de um novo objeto Cliente com os dados fornecidos
        Cliente cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
        
        // Exibição dos dados do cliente
        System.out.println("Cliente cadastrado:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Código Postal: " + cliente.getPostalCode());
        System.out.println("País: " + cliente.getPais());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Passaporte: " + cliente.getPassaporte());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        
        // Fechamento do Scanner
        scanner.close();
    }
}
