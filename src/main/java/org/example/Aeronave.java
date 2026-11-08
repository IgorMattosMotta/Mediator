package org.example;

public class Aeronave {

    public String solicitarPouso(String voo) {
        return TorreControle.getInstancia().receberPedidoPouso(voo);
    }

    public String solicitarDecolagem(String voo) {
        return TorreControle.getInstancia().receberPedidoDecolagem(voo);
    }

    public String declararEmergencia(String voo) {
        return TorreControle.getInstancia().receberEmergencia(voo);
    }

}
