package service;

import model.Elo;
import model.Jogador;

public interface EstrategiaEloImpl {
     boolean aplicarCondicao(Jogador jogador);
        Elo getElo();
    }
