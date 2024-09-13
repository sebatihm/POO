import model.Estudiante;
import model.Maestro;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        mostrarMenu();
        maestros.add(new Maestro("Luis morales", "luismorales04@uv.mx", 55425));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx", 12425));
        maestros.add(new Maestro("Magdiel Mercado", "mamercado@uv.mx", 54325));
        maestros.add(new Maestro("Patricia Martinez", "pmartinez@uv.mx", 95785));

        estudiantes.add(new Estudiante("Ricardo Landa", "landa@uv.mx", "z123","5to"));
        estudiantes.add(new Estudiante("Alexis Nava", "landa@uv.mx", "z123","5to"));
        estudiantes.add(new Estudiante("Emilio Jasso", "landa@uv.mx", "z123","5to"));

    }


}