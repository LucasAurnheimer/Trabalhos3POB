package br.com.faeterj;

import java.util.List;
import java.util.Scanner;

public class AlterarCliente {

    public void  alterarCliente1(int id, List<Cliente> Lcliente) {
        Scanner scanner = new Scanner(System.in);

     
        Cliente clienteEncontrado = buscarClientePorId(id, Lcliente);

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");

            System.out.println("\nDigite as novas informações do cliente:");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            clienteEncontrado.setNome(nome);

            System.out.println("Endereço: ");
            String endereco = scanner.nextLine();
            clienteEncontrado.setEndereco(endereco);

            System.out.println("Código Postal: ");
            String postalCode = scanner.nextLine();
            clienteEncontrado.setPostalCode(postalCode);

            System.out.println("País: ");
            String pais = scanner.nextLine();
            clienteEncontrado.setPais(pais);

            System.out.println("CPF: ");
            String cpf = scanner.nextLine();
            clienteEncontrado.setCpf(cpf);

            System.out.println("Número do Passaporte: ");
            String passaporte = scanner.nextLine();
            clienteEncontrado.setPassaporte(passaporte);

            System.out.println("Email: ");
            String email = scanner.nextLine();
            clienteEncontrado.setEmail(email);

            System.out.println("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            clienteEncontrado.setDataNascimento(dataNascimento);

        
        } else {
            System.out.println("Cliente não encontrado.");
        }

        
     
        scanner.close();
    }
    
    private static Cliente buscarClientePorId(int id, List<Cliente> listaClientes) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
   

    


}
