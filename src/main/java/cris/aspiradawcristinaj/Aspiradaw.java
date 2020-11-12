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
import javax.swing.JOptionPane;

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
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);

        //Intro al programa.
        JOptionPane.showMessageDialog(null, "Bienvenido a tu robot de limpieza "
                + "favorito.");

        //System.out.println(fecha);
        //Pedimos usuario y contraseña.
        //final String USUARIO = "usuario";
        //final String CONTRASENA = "usuario";
        //Para la hora y fecha
        //System.out.println(fecha);

        //Ponemos para que se introduzcan dependencias.
        int habitacion1 = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la habitación 1:"));
        int habitacion2 = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la habitación 2:"));
        int cocina = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la cocina:"));
        int salon = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados del salón:"));
        int bano = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados del baño:"));
        
        
        //Ponemos el if para que el valor de las habitaciones sea válido.
        if (habitacion1 >= 0 && habitacion1 <= 100
                && habitacion2 >= 0 && habitacion2 <= 100
                && salon >= 0 && salon <= 100
                && cocina >= 0 && cocina <= 100
                && bano >= 0 && bano <= 100) {

            int suma = habitacion1 + habitacion2 + cocina + salon + bano;
            JOptionPane.showMessageDialog(null, fecha + "\nLa casa tiene un "
                    + "total de: " + suma + " metros cuadrados");

            //Ponemos el menú de opciones.
            //System.out.println("Elija una opción:\n"
            //+ "1.Aspiración\n"
            //+ "2.Aspiración y fregado\n"
            //+ "3.Salir");
            int[] opciones = {1, 2, 3};
            JOptionPane.showOptionDialog(null, fecha + "\nElija una opción",
                    "Elija una opcion", JOptionPane.DEFAULT_OPTION, salon, null,
                    args, opciones);
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
        } else {
            JOptionPane.showMessageDialog(null, fecha + "\nHa introducido "
                    + "datos erróneos");
        }
    }

}
