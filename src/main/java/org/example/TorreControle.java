package org.example;

public class TorreControle {

    private static TorreControle instancia = new TorreControle();

    private TorreControle() {}

    public static TorreControle getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String voo) {
        return "Torre de Controle recebeu sua solicitação.\n" +
                "A Pista respondeu conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberPedidoPouso(voo);
    }

    public String receberPedidoDecolagem(String voo) {
        return "Torre de Controle recebeu sua solicitação.\n" +
                "A Pista respondeu conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberPedidoDecolagem(voo);
    }

    public String receberEmergencia(String voo) {
        return "Torre de Controle recebeu sua solicitação.\n" +
                "A Pista respondeu conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberEmergencia(voo);
    }

}
