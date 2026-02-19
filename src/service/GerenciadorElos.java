package service;

import estrategias.elos.*;
import model.Elo;
import model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorElos {


    private final List<EstrategiaEloImpl> estrategias = new ArrayList<>();

    public GerenciadorElos() {
        estrategias.add(new EstrategiaFerro());
        estrategias.add(new EstrategiaBronze());
        estrategias.add(new EstrategiaPrata());
        estrategias.add(new EstrategiaOuro());
        estrategias.add(new EstrategiaPlatina());
    }

    public Elo aplicarElo(Jogador jogador) {
        for (EstrategiaEloImpl estrategia : estrategias) {
            if (estrategia.aplicarCondicao(jogador)) {
                return estrategia.getElo();
            }
        }
        return Elo.Ferro;
    }
}


