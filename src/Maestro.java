import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    //Atributo
    private String numPersonal;
    private String especialidad;
    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();


    // cONSTRUCTOR
    Maestro(){
        System.out.println("Hola me accione primero");

    }

    public Maestro(String nombre, String especialidad) {
        System.out.println("Hola sobrecarga con 2 parametros");
        this.especialidad = especialidad;

    }

    public Maestro(String nombre) {
        System.out.println("Hola sobrecarga con 1 parametro");
        super.setNombre(nombre);

    }

    //Comportamientos / metodos
    public void mostrarNombre(){
        System.out.println("Nombre: " + super.getNombre());
    }

    //Get and Set
    public String getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(String numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTutoriasDisponibles(ArrayList<TutoriasDisponibles> tutoriasDisponibles) {
        this.tutoriasDisponibles = tutoriasDisponibles;
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles(){
        return tutoriasDisponibles;
    }


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
