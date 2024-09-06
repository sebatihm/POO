import java.util.Date;
import java.util.Scanner;
import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        Maestro maestro = new Maestro("Morales");
// mostrarMenu();
        maestro.addCursoDisponible(new Date(),"12: 00");
        maestro.addCursoDisponible(new Date(),"14: 00");
        maestro.addCursoDisponible(new Date(),"16: 00");
// Listar tutorias
        System.out.println(maestro.getNombre());
        System.out.println("Cursos Disponibles: ");
        for(Maestro.TutoriasDisponibles tutoria : maestro.getTutoriasDisponibles()){
            System.out.println(tutoria.getFecha() + " " + tutoria.getHora());
        }


    }


}