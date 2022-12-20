package org.araujo;

public abstract class JogadorEstado {
    
    public abstract String getEstado();

    public boolean admitir(Jogador jogador) {
        return false;
    }

    public boolean dispensar(Jogador jogador) {
        return false;
    }

    public boolean emprestar(Jogador jogador) {
        return false;
    }

    public boolean suspender(Jogador jogador) {
        return false;
    }

    public boolean transferir(Jogador jogador) {
        return false;
    }
    
}
