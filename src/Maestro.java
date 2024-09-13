import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    //Atributo
    private int numPersonal;
    private String especialidad;
    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();


    // cONSTRUCTOR


    public Maestro(String nombre, int numPersonal) {
        super(nombre);
        this.numPersonal = numPersonal;

    }

    public Maestro(String nombre, String correo) {
        super(nombre,correo);

    }

    public Maestro(String nombre, String correo,int numPersonal) {
        super(nombre,correo);
        this.numPersonal = numPersonal;

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
    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
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


    public void addTutoriasDisponible(Date fecha,String hora){
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

        @Override
        public String toString() {
            return "Id: " + id + " Fecha: " + fecha + " Hora: " + hora + "\n";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de personal: " + numPersonal +
                "\nTutorias Disponibles: \n"
                + tutoriasDisponibles.toString();
    }

    @Override
    public void saludar(){

    }
}
