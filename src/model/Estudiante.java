package model;

public class Estudiante extends Usuario{
    public String matricula;
    public String semestre;

    public Estudiante(String nombre, String correo, String matricula, String semestre) {
        super(nombre, correo);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public Estudiante(String nombre) {
        super(nombre);

    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula ;
    }

    @Override
    public void saludar(){

    }

}
