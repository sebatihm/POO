public class ClaseExterna {
    private String nombre = "Morales";

    public void metodoExterno(){
        class ClaseLocal{
            public void saludar(){
                System.out.println("Hola " + nombre);
            }
        }
        ClaseLocal cl = new ClaseLocal();
        cl.saludar();
    }

}
