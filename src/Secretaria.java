public class Secretaria extends Usuario{
    private String area;
    private String turno;

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
        return super.toString() + "Secretaria{" + "area=" + area + ", turno=" + turno + '}';
    }

    @Override
    public void saludar(){

    }
}
