package ui;

import java.util.Scanner;

import static ui.UIMenu.*;

public class UIMaestro {
    public static void maestroMenu(){
        int respuesta;
       do{
           System.out.println("..:: Maestro ::..");
           System.out.println("Seleccione una opcion: ");
           System.out.println("1. Agregar Curso.");
           System.out.println("2. Listar Curso.");
           System.out.println("3. Salir");

           Scanner sc = new Scanner(System.in);
           respuesta = sc.nextInt();
           switch (respuesta){
               case 1:
                   agregarTutoria();
                   break;
               case 2:
                   listarCursos();
                   break;
               case 3:
                   mostrarMenu();
                   break;
               default:
                   System.out.println("Seleccione una opcion valida");
                   break;
           }
       }while(respuesta!=0);
    }

    public static void agregarTutoria(){
        System.out.println("Agregar Tutoria");
        System.out.println("Ingrese la fecha del curso: [dd/mm/yyyy]");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("Ingrese la hora: [00:00]");
        String hora = sc.nextLine();


    }

    public static void listarCursos(){
        System.out.println("Listado de cursos");
    }


}
