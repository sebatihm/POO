package model;

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


    public void addTutoriasDisponible(String fecha,String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha,hora));
    }

    public static class TutoriasDisponibles extends CitaTutoria {
        TutoriasDisponibles(String fecha,String hora){
            super(fecha,hora);
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
