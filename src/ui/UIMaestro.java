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
                   System.out.println("Agregar un curso:");
                   break;
               case 2:
                   System.out.println("Listar un curso:");
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
}
