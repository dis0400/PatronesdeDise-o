package AbstactMethod;

public class FactoryPasaje {
    public static IPasaje createPasaje(Pasajero pasajero, String numeroAsiento, String type){
        IPasaje pasaje;
        
        switch(type){
            case "standard":
                pasaje = new PasajeStandard();
                pasaje.setCostoPasaje("100 US");
                break;
            case "solidario":
                pasaje = new PasajeSolidario();
                pasaje.setCostoPasaje("100 US");
                pasajeSolidario(0.5, "Discapacidad", (PasajeSolidario) pasaje);
                break;
            case "infantil":
                pasaje = new PasajeInfantil();
                pasaje.setCostoPasaje("50 US");
                break;
            default:
                pasaje = new PasajeStandard();
        }
        pasaje.setAvion(new Avion("MOR", "1 ton", "AY70", 100));
        pasaje.setOrigen(new Lugar("Alemania", "Berlin", "Aeropueto Internacional de Alemania"));
        pasaje.setDestino(new Lugar("Argentina", "Cordoba", "Aeropuerto Internacional de Argentina"));
        pasaje.setNumeroVuelo("345B");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }
        public static void pasajeSolidario(double descuento, String motivo, PasajeSolidario pasaje) {
            pasaje.setDescuento(descuento);
            pasaje.setMotivoDeDescuento(motivo);
        }
}
