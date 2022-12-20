package org.araujo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    Jogador aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Jogador();
    }

    // Jogador admitido

    @Test
    public void naoDeveAdmitirJogadorAdmitido() {
        aluno.setEstado(JogadorEstadoAdmitido.getInstance());
        assertFalse(aluno.admitir());
    }

    @Test
    public void deveDispensarJogadorAdmitido() {
        aluno.setEstado(JogadorEstadoAdmitido.getInstance());
        assertTrue(aluno.dispensar());
    }

    @Test
    public void deveEmprestarJogadorAdmitido() {
        aluno.setEstado(JogadorEstadoAdmitido.getInstance());
        assertTrue(aluno.emprestar());
    }

    @Test
    public void deveSuspenderJogadorAdmitido() {
        aluno.setEstado(JogadorEstadoAdmitido.getInstance());
        assertTrue(aluno.suspender());
    }

    @Test
    public void deveTransferirJogadorAdmitido() {
        aluno.setEstado(JogadorEstadoAdmitido.getInstance());
        assertTrue(aluno.transferir());
    }

    // Jogador dispensado

    @Test
    public void deveAdmitirJogadorDispensado() {
        aluno.setEstado(JogadorEstadoDispensado.getInstance());
        assertTrue(aluno.admitir());
    }

    @Test
    public void naoDeveDispensarJogadorDispensado() {
        aluno.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(aluno.dispensar());
    }

    @Test
    public void naoDeveEmprestarJogadorDispensado() {
        aluno.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(aluno.emprestar());
    }

    @Test
    public void naoDeveSuspenderJogadorDispensado() {
        aluno.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(aluno.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorDispensado() {
        aluno.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(aluno.transferir());
    }

    // Jogador emprestado

    @Test
    public void deveAdmitirJogadorEmprestado() {
        aluno.setEstado(JogadorEstadoEmprestado.getInstance());
        assertTrue(aluno.admitir());
    }

    @Test
    public void naoDeveDispensarJogadorEmprestado() {
        aluno.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(aluno.dispensar());
    }

    @Test
    public void naoDeveEmprestarJogadorEmprestado() {
        aluno.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(aluno.emprestar());
    }

    @Test
    public void naoDeveSuspenderJogadorEmprestado() {
        aluno.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(aluno.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorEmprestado() {
        aluno.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(aluno.transferir());
    }

    // Jogador suspenso

    @Test
    public void deveAdmitirJogadorSuspenso() {
        aluno.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(aluno.admitir());
    }

    @Test
    public void deveDispensarJogadorSuspenso() {
        aluno.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(aluno.dispensar());
    }

    @Test
    public void naoDeveEmprestarJogadorSuspenso() {
        aluno.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(aluno.emprestar());
    }

    @Test
    public void naoDeveSuspenderJogadorSuspenso() {
        aluno.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(aluno.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorSuspenso() {
        aluno.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(aluno.transferir());
    }

    // Jogador transferido

    @Test
    public void deveAdmitirJogadorTransferido() {
        aluno.setEstado(JogadorEstadoTransferido.getInstance());
        assertTrue(aluno.admitir());
    }

    @Test
    public void naoDeveDispensarJogadorTransferido() {
        aluno.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(aluno.dispensar());
    }

    @Test
    public void naoDeveEmprestarJogadorTransferido() {
        aluno.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(aluno.emprestar());
    }

    @Test
    public void naoDeveSuspenderJogadorTransferido() {
        aluno.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(aluno.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorTransferido() {
        aluno.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(aluno.transferir());
    }

}