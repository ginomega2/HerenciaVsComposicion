package Controles;

public class TextBox extends UIControl{
    private String texto="";


    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void clear() {
         texto="";
    }
}
