package org.example;

public class Pista implements Setor {

    private static Pista instancia = new Pista();

    private Pista() {}

    public static Pista getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String voo) {
        return "Pista liberada para pouso do voo " + voo;
    }

    public String receberPedidoDecolagem(String voo) {
        return "Pista liberada para decolagem do voo " + voo;
    }

    public String receberEmergencia(String voo) {
        return "Pista desocupada com prioridade para pouso de emergência do voo " + voo;
    }
}
