package br.com.faeterj;

public class cinema {

	    public static class Filme {
	        private String titulo;
	        private String diretor;
	        private int anoLancamento;
	        private String genero;
	        private String duracao;
	        private String classificacao;
	        private String sinopse;

	        public Filme(String titulo, String diretor, int anoLancamento, String genero, String duracao, String classificacao, String sinopse) {
	            this.titulo = titulo;
	            this.diretor = diretor;
	            this.anoLancamento = anoLancamento;
	            this.genero = genero;
	            this.duracao = duracao;
	            this.classificacao = classificacao;
	            this.sinopse = sinopse;
	        }

	        public String getTitulo() {
	            return titulo;
	        }

	        public String getDiretor() {
	            return diretor;
	        }

	        public int getAnoLancamento() {
	            return anoLancamento;
	        }

	        public String getGenero() {
	            return genero;
	        }

	        public String getDuracao() {
	            return duracao;
	        }

	        public String getClassificacao() {
	            return classificacao;
	        }

	        public String getSinopse() {
	            return sinopse;
	        }
	    }

	    public static class Sala {
	    	
	    }

	    
}
