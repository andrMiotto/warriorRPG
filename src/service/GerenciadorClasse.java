package service;

import model.Classe;
import model.Jogador;
import estrategias.classes.EstrategiaLutador;
import estrategias.classes.EstrategiaMago;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorClasse {

    private final List<EstrategiaClasseImpl> estrategias;

    public GerenciadorClasse() {
        this.estrategias = new ArrayList<>();
        estrategias.add(new EstrategiaMago());
        estrategias.add(new EstrategiaLutador());
    }

    public Classe aplicarClasse(Jogador jogador) {
        for (EstrategiaClasseImpl estrategia : estrategias) {
            if (estrategia.aplicarCondicao(jogador)) {
                return estrategia.getClasse();
            }
        }
        return Classe.TANK;
    }
}
