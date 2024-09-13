package ui;

import model.Estudiante;
import model.Maestro;
import model.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIEstudiantes.*;
import static ui.UIMaestro.*;
import static ui.UISecretaria.*;

public class UIMenu {
    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void mostrarMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Maestros");
            System.out.println("2. model.Estudiante");
            System.out.println("0. Salir");


            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            System.out.println(respuesta);

            switch(respuesta){
                case 1:
                    maestroMenu();
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 3:
                    secretariaMenu();
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


}
