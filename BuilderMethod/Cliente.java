package BuilderMethod;

public class Cliente {
    public static void main(String[] args) {
        Dueño dueño = new Dueno();
        CompuI9_alto alto = new CompuI9_alto();
        CompuI7_medio medio = new CompuI7_medio();
        CompuI5_bajo bajo = new CompuI5_bajo();

        dueño.setComputadora(alto);
        dueño.buildComputadora();

        Computadora compu1 = dueño.getComputadora();

        dueño.setComputadora(medio);
        dueño.buildComputadora();

        Computadora compu2 = dueño.getComputadora();

        dueño.setComputadora(bajo);
        dueño.buildComputadora();

        Computadora compu3 = dueño.getComputadora();

        compu1.showInfo();
        compu2.showInfo();
        compu3.showInfo();
    }
}
