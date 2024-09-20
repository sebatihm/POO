package ui;

import model.Maestro;

import java.util.Scanner;

public class UIEstudiantes {
    public static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void estudianteMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: model.Estudiante ::..");
            System.out.println("1. Agendar tutoria");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            System.out.println(respuesta);

            switch(respuesta){
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarMisTutorias();
                    break;
                case 0:
                    System.out.println("Bye.");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta valida");
                    break;

            }

        } while (respuesta != 0);
    }

    public static void agendarTutoria(){
        System.out.println("..:: Agendar tutoria ::..");

    }

    public static void listarMisTutorias(){

    }
}
