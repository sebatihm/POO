import java.util.Date;
import java.util.Scanner;
import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        ClaseExterna instancia = new ClaseExterna();
        ClaseExterna.ClaseInterna instanciaAnidada  = instancia.new ClaseInterna();
        instanciaAnidada.saludar();


    }


}