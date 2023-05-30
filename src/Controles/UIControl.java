package Controles;

public class UIControl {
    private boolean estaActivado=true;

    public UIControl(boolean estaActivado) {

        this.estaActivado = estaActivado;
        System.out.println("UIControl");
    }

    public void activar(){
        estaActivado=true;
    }

    public void desactivar(){
        estaActivado=false;
    }

    public boolean estaActivado(){
        return estaActivado;
    }
}
