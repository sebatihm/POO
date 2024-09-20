import model.Estudiante;
import model.Maestro;
import ui.UIEstudiantes;
import ui.UIMaestro;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Maestro maestro1 = new Maestro("Luis morales", "luismorales04@uv.mx", 55425);
        maestro1.addTutoriasDisponible("11/09/2001","12:00");
        maestro1.addTutoriasDisponible("11/09/2001","13:00");
        maestro1.addTutoriasDisponible("11/09/2001","15:00");
        UIMaestro.maestrosConTutorias.add(maestro1);

        Maestro maestro2 = new Maestro("Magdiel Mercado", "mamercado@uv.mx", 54325);
        maestro2.addTutoriasDisponible("11/09/2001","12:00");
        maestro2.addTutoriasDisponible("11/09/2001","13:00");
        maestro2.addTutoriasDisponible("11/09/2001","15:00");
        UIMaestro.maestrosConTutorias.add(maestro2);

        maestros.add(maestro1);
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx", 12425));
        maestros.add(maestro2);
        maestros.add(new Maestro("Patricia Martinez", "pmartinez@uv.mx", 95785));

        estudiantes.add(new Estudiante("Ricardo Landa", "landa@uv.mx", "z123","5to"));
        estudiantes.add(new Estudiante("Alexis Nava", "landa@uv.mx", "z123","5to"));
        estudiantes.add(new Estudiante("Emilio Jasso", "landa@uv.mx", "z123","5to"));

        //mostrarMenu();
        UIEstudiantes.agendarTutoria();
    }


}