package org.araujo;

public class JogadorEstadoSuspenso extends JogadorEstado {

    private JogadorEstadoSuspenso() {};
    private static JogadorEstadoSuspenso instance = new JogadorEstadoSuspenso();
    public static JogadorEstadoSuspenso getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Suspenso";
    }

    @Override
    public boolean admitir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAdmitido.getInstance());
        return true;
    }

    @Override
    public boolean dispensar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        return true;
    }

}
