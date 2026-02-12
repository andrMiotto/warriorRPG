public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Zika", 1000, 40, 30);

        Classe classe = atribuirClasse(jogador);
        Elo elo = atribuirElo(jogador);

        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Ataque: " + jogador.getAtaque());
        System.out.println("Magia: " + jogador.getMagia());
        System.out.println("Classe atribuída: " + classe);
        System.out.println("Elo atribuído: " + elo);

    }

    public static Classe atribuirClasse(Jogador jogador) {

        if (jogador.getVida() > jogador.getAtaque() &&
                jogador.getVida() > jogador.getMagia()) {
            return Classe.TANK;
        }

        if (jogador.getMagia() > jogador.getVida() &&
                jogador.getMagia() > jogador.getAtaque()) {
            return Classe.MAGO;
        }

        if (jogador.getAtaque() > jogador.getVida() &&
                jogador.getAtaque() > jogador.getMagia()) {
            return Classe.LUTADOR;
        }

        return Classe.LUTADOR;
    }


    public static Elo atribuirElo(Jogador jogador) {

       double somarPontos = jogador.getAtaque()+ jogador.getMagia()+ jogador.getVida();


        if (somarPontos < 300) {
            return Elo.Ferro;
        }

        if (somarPontos < 400) {
            return Elo.Bronze;
        }

        if (somarPontos < 500) {
            return Elo.Prata;
        }

        if (somarPontos < 600) {
            return Elo.Ouro;
        }

        if (somarPontos < 700) {
            return Elo.Platina;
        }

        if (somarPontos < 800) {
            return Elo.Diamente;
        }

        if (somarPontos < 900) {
            return Elo.Mestre;
        }

        if (somarPontos < 1000) {
            return Elo.Grão_Mestre;
        }
        if (somarPontos > 1000  ) {
            return Elo.Desafiante;
        }

        return Elo.SemELo;
    }

}

class Jogador {

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


enum Classe {
    TANK,
    MAGO,
    LUTADOR
}

enum Elo {
    SemELo
    ,Ferro,
    Bronze,
    Prata,
    Ouro,
    Platina,
    Diamente,
    Grão_Mestre,
    Mestre,
    Desafiante
}