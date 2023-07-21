package br.com.faeterj;

public class Cliente {
    private String nome;
    private String cpf;
    private int celular;
    private int idade;
    private Sessao sessao;

    public Cliente(String nome, String cpf, int celular, int idade, Sessao sessao) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.idade = idade;
        this.sessao = sessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
