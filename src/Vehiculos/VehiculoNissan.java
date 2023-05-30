package Vehiculos;

public class VehiculoNissan implements Vehiculo {


    Estereo estereo ;

    public VehiculoNissan(Estereo estereo) {
        this.estereo = estereo;
    }

    public VehiculoNissan() {
        estereo=new  EstereoSony();
    }

    public Estereo getEstereo() {
        return estereo;
    }

    public void setEstereo(Estereo estereo) {
        this.estereo = estereo;
    }

    @Override
    public void acelerar() {
        System.out.println(" nisan +");


    }

    @Override
    public void frenar() {
        System.out.println(" nisan -");

    }



    @Override
    public void prender() {
        System.out.println(" nisan on");

    }

    @Override
    public void apagar() {
        System.out.println(" nisan off");

    }

}
