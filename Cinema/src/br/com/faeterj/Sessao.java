package br.com.faeterj;

import br.com.faeterj.cinema.Filme;

public class Sessao {
    private Sala sala;
    private String filme;
    private String horario;
    private String dia;

    public Sessao(cinema.Sala sala2, Filme filmeSelecionado, String horario, String dia) {

        this.horario = horario;
        this.dia = dia;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getString() {
        return filme;
    }

    public void setString(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

	public Filme getFilme() {
		
		return null;
	}
}
