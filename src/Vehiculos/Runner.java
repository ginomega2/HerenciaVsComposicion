package Vehiculos;

public class Runner {
    public static void main(String[] args) {
        VehiculoNissan vehiculo = new VehiculoNissan();
        vehiculo.estereo.prender();
        vehiculo.estereo.bajarVolumen();
        vehiculo.setEstereo(new EstereoAiwa());
        vehiculo.estereo.prender();
        vehiculo.estereo.bajarVolumen();

        Vehiculo vehiculo1 = new VehiculoNissan();

        ((VehiculoNissan) vehiculo1).setEstereo(new EstereoAiwa());
        ((VehiculoNissan) vehiculo1).estereo.prender();
        ((VehiculoNissan) vehiculo1).estereo.bajarVolumen();





    }
}
