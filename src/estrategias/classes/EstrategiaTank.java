package estrategias.classes;

import model.Classe;
import model.Jogador;
import service.EstrategiaClasseImpl;

public class EstrategiaTank implements EstrategiaClasseImpl {


    @Override
    public boolean aplicarCondicao(Jogador jogador) {
        return jogador.getVida() > jogador.getAtaque()
                && jogador.getVida() > jogador.getMagia();
    }

    @Override
    public Classe getClasse() {
        return Classe.TANK;
    }
}
