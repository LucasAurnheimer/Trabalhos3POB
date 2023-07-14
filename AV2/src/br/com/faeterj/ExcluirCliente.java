package br.com.faeterj;

import java.util.List;

public class ExcluirCliente {

	public void excluirCliente(int id, List<Cliente> lClientes) {
        boolean ClienteEncontrado = false;
        
        for (Cliente Cliente : lClientes) {
            if (Cliente.getId() == id) {
                lClientes.remove(Cliente);
                ClienteEncontrado = true;
                System.out.println("Cliente removido com sucesso.");
                break;
            }
        }

        if (!ClienteEncontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }
}

