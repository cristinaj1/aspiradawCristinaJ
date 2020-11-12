/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cris.aspiradawcristinaj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Aspiradaw {

    public static void main(String[] args) {
        //Creamos primero el scanner para que meta datos por teclado
        Scanner teclado = new Scanner(System.in);
        Random habitacionesRandom = new Random();
        
        //Para la hora y fecha.
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        LocalTime horaReal = LocalTime.now();
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);

        //HAY DUDAS, PREGUNTA*************
        //Pedimos usuario y contraseña.
        /*System.out.println("Introduzca usuario y contraseña");
        String user = teclado.nextLine();
        String pass = teclado.nextLine();
        final char usuario=user;

        String inpUser = teclado.nextLine();
        String inpPass = teclado.nextLine(); // gets input from user

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("your login message");
        } else {
            System.out.print("your error message");
        }*/
        //Para la hora y fecha
        System.out.println(fecha);

        //Ponemos para que se introduzcan dependencias.
        System.out.println("Introduzca el número de dependencias: ");
        int dependencias = teclado.nextInt();

        int totalmetros = 0;
        //Para que el usuario nos introduzca los metros de cada dependencia.
        for (int i = 0; i < dependencias; i++) {
            System.out.println("Introduzca los metros cuadrados"
                    + " de esta dependencia: ");
            int metroscuadrados = teclado.nextInt();
            totalmetros += metroscuadrados;
        }

        //Ponemos el menú de opciones.
        System.out.println("Elija una opción:\n"
                + "1.Aspiración\n"
                + "2.Aspiración y fregado\n"
                + "3.Salir");
        int opcionPrincipal = teclado.nextInt();
        switch (opcionPrincipal) {

            //Opción de Aspirar
            case 1:
                System.out.println(fecha);
                System.out.println("Elija una opción:\n"
                        + "1.Completo\n"
                        + "2.Dependencias\n"
                        + "3.Salir");
                int opcionAspirar = teclado.nextInt();

                switch (opcionAspirar) {
                    //Completo
                    case 1:
                        System.out.println(fecha
                                + "\n" + "Hay estas dependencias: " + dependencias
                                + "\nLa casa mide en total: " + totalmetros
                                + " metros cuadrados");
                    //System.out.println("El robot está en la habitación " + 

                    //Por dependencias
                    case 2:
                        System.out.println(fecha);

                    //Salir
                    case 3:
                        System.out.println("Hasta la próxima.");
                        break;
                    default:
                        System.out.println("Ha introducido un valor erróneo");
                        return;

                }

            //Opcioón aspirar y limpiar.
            case 2:
                System.out.println(fecha);
                System.out.println("Elija una opción:\n"
                        + "1.completo\n"
                        + "2.Dependencias\n"
                        + "3.Salir");
                int opcionAspirarYLimpiar = teclado.nextInt();
                switch (opcionAspirarYLimpiar) {
                    //Completo
                    case 1:
                        System.out.println(fecha);

                    //Por dependencias
                    case 2:
                        System.out.println(fecha);

                    //Salir
                    case 3:
                        System.out.println("Hasta la próxima.");
                        break;

                }

            case 3:
                System.out.println("Hasta la próxima.");
                break;

            default:
                System.out.println("Ha introducido un valor erróneo");
                return;

        }

    }

}
