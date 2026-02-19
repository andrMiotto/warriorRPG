package model;

public class Jogador {

    private String nome;
    private int vida;
    private int ataque;
    private int magia;

    public Jogador(String nome, int vida, int ataque, int magia) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.magia = magia;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getMagia() {
        return magia;
    }


}
