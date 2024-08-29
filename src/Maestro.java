public class Maestro {
    //Atributos
    static int id = 0;
    String nombre;
    String especialidad;

    // cONSTRUCTOR
    Maestro(){
        System.out.println("Hola me accione primero");
        id++;
    }

    //Comportamientos / metodos
    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }

    public void mostrarId(){
        System.out.println("Id: " + id);
    }
}
