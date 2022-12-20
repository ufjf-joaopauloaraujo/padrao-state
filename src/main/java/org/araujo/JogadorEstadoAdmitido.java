package org.araujo;

public class JogadorEstadoAdmitido extends JogadorEstado {

    private JogadorEstadoAdmitido() {};
    private static JogadorEstadoAdmitido instance = new JogadorEstadoAdmitido();
    public static JogadorEstadoAdmitido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Admitido";
    }

    @Override
    public boolean dispensar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        return true;
    }

    @Override
    public boolean emprestar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        return true;
    }

    @Override
    public boolean suspender(Jogador jogador) {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        return true;
    }

    @Override
    public boolean transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return true;
    }

}

