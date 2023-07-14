package br.com.faeterj;

import java.util.List;

public class ExcluirCama {

	public void excluirCama(int id, List<Cama> lCamas) {
        boolean CamaEncontrado = false;
        
        for (Cama Cama : lCamas) {
            if (Cama.getId() == id) {
                lCamas.remove(Cama);
                CamaEncontrado = true;
                System.out.println("Cama removida com sucesso.");
                break;
            }
        }

        if (!CamaEncontrado) {
            System.out.println("Cama não encontrada.");
        }
    }
}
