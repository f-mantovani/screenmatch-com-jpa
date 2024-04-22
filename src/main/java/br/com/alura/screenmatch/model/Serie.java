package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.service.Traducao;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria genero;
    private String sinopse;
    private String atores;
    private String poster;

    public Serie(DadosSerie dadosSerie) {
        this.titulo = dadosSerie.titulo();
        this.sinopse = Traducao.obterTraducao(dadosSerie.sinopse()).trim();
        this.poster = dadosSerie.poster();
        this.atores = dadosSerie.atores();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.parseDouble(dadosSerie.avaliacao())).orElse(0);
        this.genero = Categoria.fromEnglish(dadosSerie.genero().split(",")[0].trim());
    }

    @Override
    public String toString() {
        return """
                Título: %s, Temporadas: %d, Avaliação: %.2f
                Gênero: %s
                Atores: %s
                Sinopse: %s
                Poster: %s %n
                """.formatted(
                        getTitulo(),
                        getTotalTemporadas(),
                        getAvaliacao(),
                        getGenero(),
                        getAtores(),
                        getSinopse(),
                        getPoster());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }


}
