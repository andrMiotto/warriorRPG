package estrategias.elos;

import model.Elo;
import model.Jogador;
import service.EstrategiaEloImpl;

public class EstrategiaPlatina implements EstrategiaEloImpl {

    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        int soma = jogador.getAtaque() + jogador.getMagia() + jogador.getVida();
        return soma <= 799;
    }

    @Override
    public Elo getElo() {
        return Elo.Platina;
    }
}
