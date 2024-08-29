public class Main {
    public static void main(String[] args) {
        Calculadora.suma(4,6);
        System.out.println(Calculadora.PI);


        Maestro maestro = new Maestro();
        maestro.nombre = "Morales";
        maestro.mostrarNombre();
        maestro.mostrarId();

        Maestro.id++;

        Maestro maestro1 = new Maestro();
        maestro1.nombre = "Dr Nave";
        maestro1.mostrarNombre();
        maestro1.mostrarId();

        Maestro.id++;

        maestro1.mostrarId();
    }
}