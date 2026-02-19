package service.estrategias.elos;

import model.Elo;
import model.Jogador;
import service.EstrategiaEloImpl;

public class EstrategiaFerro implements EstrategiaEloImpl {
    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        int soma = jogador.getAtaque() + jogador.getMagia() + jogador.getVida();
        return soma <= 399;
    }

    @Override
    public Elo getElo() {
        return Elo.Ferro;
    }
}

