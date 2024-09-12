import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        Maestro maestro = new Maestro("Morales", "57522", 4444);

        maestro.addCursoDisponible(new Date(),"12: 00");
        maestro.addCursoDisponible(new Date(),"14: 00");
        maestro.addCursoDisponible(new Date(),"16: 00");

        System.out.println(maestro);


    }


}