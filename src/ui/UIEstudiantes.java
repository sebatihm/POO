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
        System.out.println("Seleccione un maestro: ");

        int i = 1;
        for(Maestro maestro : UIMaestro.maestrosConTutorias){
            System.out.println(i + ".- " + maestro.getNombre());
            i++;
        }

        int respuestaConfirmacion = 0;
        do{
            Scanner sc = new Scanner(System.in);
            int maestroElegido = sc.nextInt();

            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(maestroElegido-1);
            System.out.println("Seleccione una tutoria: ");
            i = 1;
            for(Maestro.TutoriasDisponibles td: maestroSeleccionado.getTutoriasDisponibles()){
                System.out.println(i + ".- " + td.getFecha() + " " + td.getHora());
                i++;
            }
            int tutoriaSeleccionado = sc.nextInt();

            do{
                System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoria: "
                        + maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionado-1));
                System.out.println("1.- Para agregar tutorias \n2.- Cambiar tutoria");
                respuestaConfirmacion = sc.nextInt();
            }while(respuestaConfirmacion < 1 || respuestaConfirmacion > 2);

            if(respuestaConfirmacion == 1){
                Maestro.TutoriasDisponibles ts = maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionado-1);
                UIMenu.estudianteLogueado.addCitaMaestro(maestroSeleccionado,ts.getDate(), ts.getHora());
            }


        }while (respuestaConfirmacion != 1);






    }

    public static void listarMisTutorias(){

    }
}
