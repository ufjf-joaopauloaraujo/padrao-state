package org.araujo;

public class Jogador {
    
    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorEstadoAdmitido.getInstance();
    }
    
    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }
    
    public boolean admitir() {
        return estado.admitir(this);
    }
    
    public boolean dispensar() {
        return estado.dispensar(this);
    }
    
    public boolean emprestar() {
        return estado.emprestar(this);
    }
    
    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }    
}
