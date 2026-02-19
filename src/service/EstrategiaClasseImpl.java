package service;

import model.Classe;
import model.Jogador;

public interface EstrategiaClasseImpl {
    boolean aplicarCondicao(Jogador jogador);
    Classe getClasse();

}

