package org.araujo;

public class JogadorEstadoEmprestado extends JogadorEstado {

    private JogadorEstadoEmprestado() {};
    private static JogadorEstadoEmprestado instance = new JogadorEstadoEmprestado();
    public static JogadorEstadoEmprestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Emprestado";
    }

    @Override
    public boolean admitir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAdmitido.getInstance());
        return true;
    }

}
