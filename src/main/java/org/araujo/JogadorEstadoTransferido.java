package org.araujo;

public class JogadorEstadoTransferido extends JogadorEstado {

    private JogadorEstadoTransferido() {};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

    @Override
    public boolean admitir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAdmitido.getInstance());
        return true;
    }

}
