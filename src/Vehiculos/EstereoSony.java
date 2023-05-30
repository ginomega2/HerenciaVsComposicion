package Vehiculos;

public class EstereoSony implements Estereo {



    @Override
    public void subirVolumen() {
        System.out.println("sony +");

    }

    @Override
    public void bajarVolumen() {
        System.out.println("sony -");
    }

    @Override
    public void prender() {
        System.out.println("sony on");

    }

    @Override
    public void apagar() {
        System.out.println("sony ff");

    }

    @Override
    public void siguiente() {
        System.out.println("sony >>");

    }

    @Override
    public void anterior() {
        System.out.println("sony <<");
    }
}
