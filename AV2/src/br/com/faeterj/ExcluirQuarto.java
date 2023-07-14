package br.com.faeterj;

import java.util.List;

public class ExcluirQuarto {

	public void excluirQuarto(int id, List<Quarto> lQuartos) {
        boolean QuartoEncontrado = false;
        
        for (Quarto Quarto : lQuartos) {
            if (Quarto.getId() == id) {
                lQuartos.remove(Quarto);
                QuartoEncontrado = true;
                System.out.println("Quarto removido com sucesso.");
                break;
            }
        }

        if (!QuartoEncontrado) {
            System.out.println("Quarto não encontrado.");
        }
    }
}
