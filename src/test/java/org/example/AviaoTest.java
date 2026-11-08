package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoTest {

    @Test
    void deveSolicitarPouso() {
        Aviao aviao = new Aviao();
        assertEquals("Torre de Controle recebeu sua solicitação.\nA Pista respondeu conforme mensagem a seguir.\n" +
                ">>Pista liberada para pouso do voo GOL1234",
                aviao.solicitarPouso("GOL1234"));
    }

    @Test
    void deveSolicitarDecolagem() {
        Aviao aviao = new Aviao();
        assertEquals("Torre de Controle recebeu sua solicitação.\nA Pista respondeu conforme mensagem a seguir.\n" +
                ">>Pista liberada para decolagem do voo AZU4321",
                aviao.solicitarDecolagem("AZU4321"));
    }

    @Test
    void deveDeclararEmergencia() {
        Aviao aviao = new Aviao();
        assertEquals("Torre de Controle recebeu sua solicitação.\nA Pista respondeu conforme mensagem a seguir.\n" +
                ">>Pista desocupada com prioridade para pouso de emergência do voo LAT5678",
                aviao.declararEmergencia("LAT5678"));
    }

}
