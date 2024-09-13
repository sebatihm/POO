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
            System.out.println("2. Estudiante");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");


            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            System.out.println(respuesta);

            switch(respuesta){
                case 1:
                    loginUsuario(1);
                    break;
                case 2:
                    loginUsuario(2);
                    break;
                case 3:
                    loginUsuario(3);
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

    public static void loginUsuario(int tipoUsuario){
        // Maestro 1
        // Estudiante 2
        // Secretaria 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu correo: ");
        String correoUsuario = sc.nextLine();

        if(tipoUsuario == 1){
            for(Maestro maestro : maestros){
                if(maestro.getCorreo().equals(correoUsuario)){
                    // Maestro encontrado
                    System.out.println("Hola maestro" + maestro.getNombre());
                    maestroMenu();

                }
            }
        }
    }


}
