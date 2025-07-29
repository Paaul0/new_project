package br.com.music.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int favoritos;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getFavoritos() {
        return favoritos;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
