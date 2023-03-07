package Visitor;

public class Client {
    public static void main(String[] args) {
        Dolares usa = new Dolares();
        Euros eu = new Euros();
        Bolivianos bol = new Bolivianos();

        Viajero viajero = new Viajero();

        viajero.setMontoACambiar(170);

        usa.darVisa(viajero);
        eu.darVisa(viajero);
        bol.darVisa(viajero);
    }   
}
