package model;

import java.util.ArrayList;
import java.util.Date;

public class Secretaria extends Usuario{
    private String area;
    private String turno;
    ArrayList<Maestro.TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();


    public Secretaria(String nombre, String correo, String turno) {
        super(nombre, correo);
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "model.Secretaria{" + "area=" + area + ", turno=" + turno + '}';
    }

    public ArrayList<Maestro.TutoriasDisponibles> getTutoriasDisponibles(){
        return tutoriasDisponibles;
    }


    public void addTutoriasDisponible(Date fecha, String hora){
        tutoriasDisponibles.add(new Maestro.TutoriasDisponibles(fecha,hora));
    }

    public static class TutoriasDisponibles extends CitaTutoria {
        TutoriasDisponibles(Date fecha,String hora){
            super(fecha,hora);
        }
    }

    @Override
    public void saludar(){

    }
}
