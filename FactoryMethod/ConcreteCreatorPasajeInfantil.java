package FactoryMethod;

public class ConcreteCreatorPasajeInfantil extends CreatorPasaje {

    @Override
    public IPasaje createPasaje(Pasajero pasajero, String numeroAsiento) {
        PasajeInfantil pasaje = new PasajeInfantil();
        pasaje.setAvion(new Avion("MOR", "1 ton", "AY70", 100));
        pasaje.setCostoEspecial("40 US");
        pasaje.setOrigen(new Lugar("Alemania", "Berlin", "Aeropueto Internacional de Alemania"));
        pasaje.setDestino(new Lugar("Argentina", "Cordoba", "Aeropuerto Internacional de Argentina"));
        pasaje.setNumeroVuelo("345B");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }
}
