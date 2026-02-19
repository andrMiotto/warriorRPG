package service.estrategias.classes;

import model.Classe;
import model.Jogador;
import service.EstrategiaClasseImpl;

public class EstrategiaMago implements EstrategiaClasseImpl {


    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        return jogador.getMagia() > jogador.getVida()
                && jogador.getMagia() > jogador.getAtaque();
    }

    @Override
    public Classe getClasse() {
        return Classe.MAGO;
    }
}

