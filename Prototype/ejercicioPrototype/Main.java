public class Main {
    
    public static void main(String[] args) {
        Celular prototypeA = new Celular("Samsung", "R10", "5 inches", 2, "256 GB", "Android 12",
         4, true, 3, "1 d 8 h", new Accesorios(false, true, false, true));
        prototypeA.setSim(new Sim("Entel", "60595930"));

        //5 celulares a partir el original

        Celular prototypeB = (Celular) prototypeA.clone();
        Celular prototypeC = (Celular) prototypeA.clone();
        Celular prototypeD = (Celular) prototypeA.clone();
        Celular prototypeE = (Celular) prototypeA.clone();
        Celular prototypeF = (Celular) prototypeA.clone();

        prototypeB.setSim(new Sim("Entel", "6063458"));
        prototypeC.setSim(new Sim("Tigo", "7856740"));
        prototypeD.setSim(new Sim("Viva", "77304111"));
        prototypeE.setSim(new Sim("Entel", "65595980"));
        prototypeF.setSim(new Sim("Tigo", "63555128"));

        prototypeA.show();
        prototypeB.show();
        prototypeC.show();
        prototypeD.show();
        prototypeE.show();
        prototypeF.show();
    }
}
