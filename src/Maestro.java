public class Maestro {
    //Atributos
    public static int ID = 1;
    int id;
    String nombre;
    String especialidad;

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

    public void mostrarId(){
        System.out.println("Id: " + id);
    }
}
