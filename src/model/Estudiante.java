package model;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario{
    public String matricula;
    public String semestre;
    ArrayList<CitaMaestro> tutoriasAgendadas = new ArrayList();

    public Estudiante(String nombre, String correo, String matricula, String semestre) {
        super(nombre, correo);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public Estudiante(String nombre) {
        super(nombre);

    }
    public void addTutoriaMaestro(Maestro maestro, Date fecha, String hora) {
        CitaMaestro citaMaestro = new CitaMaestro(maestro, this);
        citaMaestro.agendar(fecha,hora);
        tutoriasAgendadas.add(new CitaMaestro(maestro, this));
    }
    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula ;
    }

    @Override
    public void saludar(){

    }

}
