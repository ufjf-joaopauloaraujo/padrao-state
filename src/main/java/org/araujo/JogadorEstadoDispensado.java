package org.araujo;

public class JogadorEstadoDispensado extends JogadorEstado {

    private JogadorEstadoDispensado() {};
    private static JogadorEstadoDispensado instance = new JogadorEstadoDispensado();
    public static JogadorEstadoDispensado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Dispensado";
    }

    @Override
    public boolean admitir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAdmitido.getInstance());
        return true;
    }

}
