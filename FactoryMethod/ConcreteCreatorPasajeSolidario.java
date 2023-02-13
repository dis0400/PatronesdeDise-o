package FactoryMethod;


public class ConcreteCreatorPasajeSolidario extends CreatorPasaje {

        private PasajeSolidario pasaje = new PasajeSolidario();
    
        @Override
        public IPasaje createPasaje(Pasajero pasajero, String numeroAsiento) {
            pasaje.setAvion(new Avion("MOR", "1 ton", "AY70", 100));
        pasaje.setCostoEspecial("40 US");
        pasaje.setOrigen(new Lugar("Alemania", "Berlin", "Aeropueto Internacional de Alemania"));
        pasaje.setDestino(new Lugar("Argentina", "Cordoba", "Aeropuerto Internacional de Argentina"));
        pasaje.setNumeroVuelo("345B");
            pasaje.setNumeroAsiento(numeroAsiento);
            pasaje.setPasajero(pasajero);
            pasajeSolidario(0.5, "Discapacidad");
            return pasaje;
        }
    
        public void pasajeSolidario(double descuento, String motivo) {
            pasaje.setDescuento(descuento);
            pasaje.setMotivoDeDescuento(motivo);
        }
    
}

