package br.com.faeterj;

import java.util.List;

public class ExibirClientes {

	public void exibir(List<Cliente> lClientes) {
        if (lClientes.isEmpty()) {
            System.out.println("A lista de Clientes está vazia.");
        } else {
            System.out.println("Todos os Clientes registrados:");
            for (Cliente Cliente : lClientes) {
                System.out.println(Cliente);
            }
        }
    }
}
