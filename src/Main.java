import model.Jogador;
import service.EstrategiaEloImpl;
import service.GerenciadorClasse;
import service.GerenciadorElos;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Zika", 0, 0, 1);

        GerenciadorClasse gerenciadorClasse = new GerenciadorClasse();
        GerenciadorElos gerenciadorElos = new GerenciadorElos();

        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Ataque: " + jogador.getAtaque());
        System.out.println("Magia: " + jogador.getMagia());
        System.out.println("Classe atribuída: " + gerenciadorClasse.aplicarClasse(jogador));
        System.out.println("Elo atribuído: " + gerenciadorElos.aplicarElo(jogador));
    }




}




