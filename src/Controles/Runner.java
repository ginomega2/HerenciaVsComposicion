package Controles;

public class Runner {

    public static void main(String[] args) {
//        var control = new UIControl();
        var control2 = new TextBox();
//        control.desactivar();
//        System.out.println(control.estaActivado());

        control2.setTexto("inserta tu nombre");
        control2.activar();
        System.out.println(control2.estaActivado());


    }

}
