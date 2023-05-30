package Vehiculos;

public class EstereoAiwa implements Estereo {
    @Override
    public void subirVolumen() {

        System.out.println("aiwa +");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("aiwa -");
    }

    @Override
    public void prender() {
        System.out.println("aiwa on");
    }

    @Override
    public void apagar() {
        System.out.println("aiwa off");
    }

    @Override
    public void siguiente() {
        System.out.println("aiwa >>");

    }

    @Override
    public void anterior() {
        System.out.println("aiwa <<");
    }
}
