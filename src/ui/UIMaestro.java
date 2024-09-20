package ui;

import model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIMenu.*;

public class UIMaestro {
    public static ArrayList<Maestro> maestrosConTutorias = new ArrayList<>();
    public static void maestroMenu(){
        int respuesta;
       do{
           System.out.println("..:: Maestro ::..");
           System.out.println("Seleccione una opcion: ");
           System.out.println("1. Agregar tutorias.");
           System.out.println("2. Listar tutorias.");
           System.out.println("3. Salir");

           Scanner sc = new Scanner(System.in);
           respuesta = sc.nextInt();
           switch (respuesta){
               case 1:
                   agregarTutoria();
                   break;
               case 2:
                   listarTutorias();
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
        int respuesta = 0;

        boolean banderaExterna = true;
        do {
            System.out.println("Ingrese la fecha del curso: [dd/mm/yyyy]");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingrese la hora: [00:00]");
            String hora = sc.nextLine();

            boolean banderaInterna = true;
            do {
                System.out.println("La fecha es: " + fecha+ " " + hora) ;
                System.out.println("1.- Para agregar tutorias \n2.- Cambiar tutoria");
                respuesta = sc.nextInt();
                if(respuesta==2){
                    banderaInterna = false;
                } else if(respuesta==1){
                    banderaExterna = false;
                    banderaInterna = false;
                    maestroLogueado.addTutoriasDisponible(fecha,hora);
                    consultarMaestroConTutoria(maestroLogueado);
                    System.out.println("Todo bien");
                } else {
                    System.out.println("Seleccione una opcion valida");
                }
            } while (banderaInterna);

        } while (banderaExterna);
    }

    public static void listarTutorias(){
        System.out.println("Listado de tutorias");

        if(maestroLogueado.getTutoriasDisponibles().size()>0){
            int j = 1;
            for (int i = 0; i < maestroLogueado.getTutoriasDisponibles().size(); i++) {
                System.out.println(j + ".- " + maestroLogueado.getTutoriasDisponibles().get(i).getFecha()
                        + " " + maestroLogueado.getTutoriasDisponibles().get(i).getHora());
                j++;
            }
        } else {
            System.out.println("No hay registros. ");
        }
    }

    private static void consultarMaestroConTutoria(Maestro maestro) {

        if(!maestrosConTutorias.contains(maestro)){
            maestrosConTutorias.add(maestro);
        }

    }
}
