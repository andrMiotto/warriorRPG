package service.estrategias.elos;

import model.Elo;
import model.Jogador;
import service.EstrategiaEloImpl;

public class EstrategiaBronze implements EstrategiaEloImpl {

    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        int soma = jogador.getAtaque() + jogador.getMagia() + jogador.getVida();
        return soma <= 499;
    }

    @Override
    public Elo getElo() {
        return Elo.Bronze;
    }
}
