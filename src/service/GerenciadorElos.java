package service;

import model.Elo;
import model.Jogador;
import service.estrategias.elos.EstrategiaBronze;
import service.estrategias.elos.EstrategiaFerro;
import service.estrategias.elos.EstrategiaOuro;
import service.estrategias.elos.EstrategiaPrata;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorElos {


    private final List<EstrategiaEloImpl> estrategias = new ArrayList<>();

    public GerenciadorElos() {
        estrategias.add(new EstrategiaFerro());
        estrategias.add(new EstrategiaBronze());
        estrategias.add(new EstrategiaPrata());
        estrategias.add(new EstrategiaOuro());
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


