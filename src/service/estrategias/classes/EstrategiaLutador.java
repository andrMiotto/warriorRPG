package service.estrategias.classes;

import model.Classe;
import model.Jogador;
import service.EstrategiaClasseImpl;

public class EstrategiaLutador implements EstrategiaClasseImpl {


    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        return jogador.getAtaque() > jogador.getVida()
                && jogador.getAtaque() > jogador.getMagia();
    }

    @Override
    public Classe getClasse() {
        return Classe.LUTADOR;
    }
}
