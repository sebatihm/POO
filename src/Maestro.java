import java.util.ArrayList;
import java.util.Date;

public class Maestro {
    //Atributos
    public static int ID = 1;
    private int id;
    private String nombre;
    private String especialidad;

    // cONSTRUCTOR
    Maestro(){
        System.out.println("Hola me accione primero");
        id = ID++;
    }

    public Maestro(String nombre, String especialidad) {
        System.out.println("Hola sobrecarga con 2 parametros");
        this.nombre = nombre;
        this.especialidad = especialidad;
        id = ID++;
    }

    public Maestro(String nombre) {
        System.out.println("Hola sobrecarga con 1 parametro");
        this.nombre = nombre;
        id = ID++;
    }

    //Comportamientos / metodos
    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }

    //Get and Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles(){
        return tutoriasDisponibles;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addCursoDisponible(Date fecha,String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha,hora));
    }

    public static class TutoriasDisponibles{
        private int id;
        private Date fecha;
        private String hora;

        public TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }
}
