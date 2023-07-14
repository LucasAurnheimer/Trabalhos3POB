package br.com.faeterj;

import java.util.Scanner;

public class InserirCliente {

	public Cliente obterDadosCliente() {
	
		
        // Criação de um objeto Scanner para ler os dados do cliente
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os dados do cliente: ");
        int id = Main.ultimoId;
        
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

        cliente.setId(id);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
        cliente.setPostalCode(postalCode);
        cliente.setPais(pais);
        cliente.setCpf(cpf);
        cliente.setPassaporte(passaporte);
        cliente.setEmail(email);
        cliente.setDataNascimento(dataNascimento);
        
        return cliente;
    }
}
