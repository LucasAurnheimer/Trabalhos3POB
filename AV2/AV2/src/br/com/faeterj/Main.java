package br.com.faeterj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int ultimoId = 0;
	public static int ultimoIdCama = 0;
	
	
	
    public static void main(String[] args) {
        ArrayList<Cliente> Lcliente = new ArrayList();
        ArrayList<Cama> Lcama = new ArrayList();
        ArrayList<Quarto> quarto = new ArrayList();
        ArrayList<Reserva> reserva = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nInserir Cliente");
                    
                    InserirCliente novoCliente = new InserirCliente();
                    Cliente cliente = novoCliente.obterDadosCliente();
                    Lcliente.add(cliente);
                    adicionarClienteArquivo(cliente);

                    System.out.println("Cliente adicionado com sucesso!");
                    
                    ultimoId = ultimoId + 1;
                    
                    break;

                case 2:
                    System.out.println("\nAlterar Cliente");
                    System.out.println("Digite o ID do cliente que deseja alterar: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();
                    
                    Cliente clienteEncontrado = null;

                    for (Cliente cliente1 : Lcliente) {
                        if (cliente1.getId() == idCliente) {
                            clienteEncontrado = cliente1;
                            break;
                        }
                    }
                    
                    if (clienteEncontrado != null) {
                    	AlterarCliente.alterarcliente1(clienteEncotrado);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    
                   
                    break;

                case 3:
                    System.out.println("\nDeletar Cliente");
                    ExcluirCliente excluir = new ExcluirCliente();
                    System.out.println("Digite o Id do Cama que deseja excluir:");
                    int idExcluir = scanner.nextInt();
                    scanner.nextLine(); 
                    excluir.excluirCliente(idExcluir, Lcliente);
                    
                    break;

                case 4:
                    System.out.println("\nLista de Clientes:");
                    ExibirClientes exibirClientes = new ExibirClientes();
                    exibirClientes.exibir(Lcliente);
                    break;

                case 5:
                    System.out.println("\nInserir Cama");
                    InserirCama novaCama = new InserirCama();
                    Cama cama = novaCama.obterDadoscama();
                    Lcama.add(cama);

                    System.out.println("Cama adicionado com sucesso!");
                    
                    ultimoIdCama = ultimoIdCama + 1;
                    break;

                case 6:
                    System.out.println("\nAlterar Cama");
                    int idCama = scanner.nextInt();
                    scanner.nextLine();
                    
                    Cama CamaEncontrado = null;
                    for (Cama Cama1 : Lcama) {
                        if (Cama1.getId() == idCama) {
                            CamaEncontrado = Cama1;
                            break;
                        }
                    }
                    
                    if (CamaEncontrado != null) {
                    	AlterarCama.alterarCama(CamaEncontrado);
                    } else {
                        System.out.println("Cama não encontrado.");
                    }

                case 7:
                    System.out.println("\nDeletar Cama");
                    ExcluirCama excluir1 = new ExcluirCama();
                    System.out.println("Digite o Id da Cama que deseja excluir:");
                    int idExcluir1 = scanner.nextInt();
                    scanner.nextLine(); 
                    excluir1.excluirCama(idExcluir1, Lcama);
                    break;

                case 8:
                    System.out.println("\nLista de Camas:");
                    ExibirCamas exibirCamas = new ExibirCamas();
                    exibirCamas.exibir(Lcama);
                    break;

                case 9:
                    System.out.println("\nInserir Quarto");
                    // Implemente a lógica para inserir um quarto
                    break;

                case 10:
                    System.out.println("\nAlterar Quarto");
                    // Implemente a lógica para alterar um quarto
                    break;

                case 11:
                    System.out.println("\nDeletar Quarto");
                    // Implemente a lógica para deletar um quarto
                    break;

                case 12:
                    System.out.println("\nLista de Quartos:");
                    // Implemente a lógica para exibir a lista de quartos
                    break;

                case 13:
                    System.out.println("\nInserir Reserva");
                    // Implemente a lógica para inserir uma reserva
                    break;

                case 14:
                    System.out.println("\nAlterar Reserva");
                    // Implemente a lógica para alterar uma reserva
                    break;

                case 15:
                    System.out.println("\nExcluir Reserva");
                    // Implemente a lógica para excluir uma reserva
                    break;

                case 16:
                    System.out.println("\nLista de Reservas:");
                    // Implemente a lógica para exibir a lista de reservas
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("------ Menu ------");
        System.out.println("1 - Inserir Cliente");
        System.out.println("2 - Alterar Cliente");
        System.out.println("3 - Deletar Cliente");
        System.out.println("4 - Lista de Clientes");
        System.out.println("5 - Inserir Cama");
        System.out.println("6 - Alterar Cama");
        System.out.println("7 - Deletar Cama");
        System.out.println("8 - Lista de Camas");
        System.out.println("9 - Inserir Quarto");
        System.out.println("10 - Alterar Quarto");
        System.out.println("11 - Deletar Quarto");
        System.out.println("12 - Lista de Quartos");
        System.out.println("13 - Inserir Reserva");
        System.out.println("14 - Alterar Reserva");
        System.out.println("15 - Excluir Reserva");
        System.out.println("16 - Lista de Reservas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void adicionarClienteArquivo(Cliente cliente) {
        try {
            FileWriter arquivo = new FileWriter("clientes.txt", true);
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(cliente.getId() + ";" + cliente.getNome() + ";" + cliente.getEndereco()+ ";" + cliente.getCpf() + ";" + cliente.getEmail() + ";" + cliente.getPais());
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro.");
        }
    }
        
}
