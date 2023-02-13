package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PasajeStandard s1 = (PasajeStandard) new ConcreteCreatorPasajeStandard().createPasaje(new Pasajero("Valentina La Faye", "130886"), "A1");
        PasajeStandard s2 = (PasajeStandard) new ConcreteCreatorPasajeStandard().createPasaje(new Pasajero("Diego Moron", "300457"), "A2");

        PasajeSolidario so1 = (PasajeSolidario) new ConcreteCreatorPasajeSolidario().createPasaje(new Pasajero("Mariel Soria", "88932"), "F3");
        PasajeSolidario so2 = (PasajeSolidario) new ConcreteCreatorPasajeSolidario().createPasaje(new Pasajero("Fabian Sanchez", "273290"), "G3");

        PasajeInfantil i1 = (PasajeInfantil) new ConcreteCreatorPasajeInfantil().createPasaje(new Pasajero("Rodrigo Limpias", "134791"), "L2");
        PasajeInfantil i2 = (PasajeInfantil) new ConcreteCreatorPasajeInfantil().createPasaje(new Pasajero("Gabriel Tapia", "1349032"), "L5");

        s1.show();
        s2.show();

        so1.show();
        so2.show();

        i1.show();
        i2.show();

    }
}
