package ui;

import java.util.Scanner;

public class UIMenu {
    public static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static void mostrarMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("0. Salir");


            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            System.out.println(respuesta);

            switch(respuesta){
                case 1:
                    System.out.println("..:: Maestros ::..");
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 0:
                    System.out.println("Bye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta valida");
                    break;

            }
        }while (respuesta != 0);
    }

    public static void estudianteMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1. Agendar tutoria");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            System.out.println(respuesta);

            switch(respuesta){
                case 1:
                    System.out.println("..:: Agendar tutoria ::..");
                    System.out.println("Selecciona una opcion:");
                    for(int i = 0; i < 5; i++){
                        System.out.println(i + ". " + meses[i]);

                    }
                    break;
                case 2:
                    System.out.println("..:: Mis tutorias ::..");
                    break;
                case 0:
                    System.out.println("Bye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta valida");
                    break;

            }

        } while (respuesta != 0);
    }
}
