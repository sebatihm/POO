import java.util.ArrayList;

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

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public static class TutoriasDisponibles{
        private int id;
        private Date fecha;
        private String hora;

        public TutoriasDisponibles(int id, Date fecha, String hora) {
            this.id = id;
            this.fecha = fecha;
            this.hora = hora;
        }

    }
}
