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

        //Creamos una variable para la bater铆a inicializada en 0.
        int carga;

        //Para la hora y fecha.
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);

        //Intro al programa.
        JOptionPane.showMessageDialog(null, "Bienvenido a tu robot de limpieza "
                + "favorito.");

        //System.out.println(fecha);
        //Pedimos usuario y contrase帽a.
        final String USUARIO = "usuario";
        final String CONTRASENA = "usuario";
        String entrar1 = JOptionPane.showInputDialog(fecha 
                + "\nIntroduzca usuario");
        String entrar2 = JOptionPane.showInputDialog(fecha 
                + "\nIntroduzca contrase馻");
        if(USUARIO == entrar1 && CONTRASENA == entrar2){
        
        
        
        //Ponemos para que se introduzcan dependencias.
        int habitacion1 = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la habitaci贸n 1:"));
        int habitacion2 = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la habitaci贸n 2:"));
        int cocina = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados de la cocina:"));
        int salon = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados del sal贸n:"));
        int bano = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nIntroduzca los metros "
                + "cuadrados del ba帽o:"));

        //Ponemos el if para que el valor de las habitaciones sea v谩lido.
        if (habitacion1 >= 0 && habitacion1 <= 100
                && habitacion2 >= 0 && habitacion2 <= 100
                && salon >= 0 && salon <= 100
                && cocina >= 0 && cocina <= 100
                && bano >= 0 && bano <= 100) {

            int suma = habitacion1 + habitacion2 + cocina + salon + bano;
            JOptionPane.showMessageDialog(null, fecha + "\nLa casa tiene un "
                    + "total de: " + suma + " metros cuadrados");

            //Ponemos el men煤 de opciones.
            //System.out.println("Elija una opci贸n:\n"
            //+ "1.Aspiraci贸n\n"
            //+ "2.Aspiraci贸n y fregado\n"
            //+ "3.Salir");
            int opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nElija una opci贸n:"
                    + "\n1.Apiraci贸n"
                    + "\n2.Aspiraci贸n y fregado"
                    + "\n3.Salir."));
            switch (opcionPrincipal) {

                //Opci贸n de Aspirar
                case 1:

                    int opcionAspirar = Integer.parseInt(
                            JOptionPane.showInputDialog(fecha
                                    + "\nElija una opci贸n:"
                                    + "\n1.Completo"
                                    + "\n2.Dependencias"
                                    + "\n3.Salir."));

                    switch (opcionAspirar) {
                        //Completo
                        case 1:

                        //System.out.println("El robot est谩 en la habitaci贸n " + 
                        //Por dependencias
                        case 2:
                            int opcionDependenciasAspirar
                                    = Integer.parseInt(
                                            JOptionPane.showInputDialog(
                                                    fecha
                                                    + "\nElija una opci贸n:"
                                                    + "\n1.Habitaci贸n 1"
                                                    + "\n2.Habitaci贸n 2"
                                                    + "\n3.Sal贸n"
                                                    + "\n4.Cocina"
                                                    + "\n5.Ba帽o"
                                                    + "\n6.Salir."));
                            switch (opcionDependenciasAspirar) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de aspirar "
                                                    + "la habitaci贸n 1.");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de aspirar"
                                                    + " la habitaci贸n 2.");
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de aspirar el sal贸n.");
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de aspirar la cocina.");
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de aspirar el ba帽o.");
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nHasta la pr贸xima.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nIntroduzca un valor v谩lido.");
                                    return;

                            }


                        //Salir
                        case 3:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\nHasta la pr贸xima");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\nHa introducido datos err贸neos");
                            return;

                    }

                //Opcio贸n aspirar y limpiar.
                case 2:

                    int opcionAspirarYLimpiar = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nElija una opci贸n:"
                            + "\n1.Completo"
                            + "\n2.Dependencias"
                            + "\n3.Salir."));
                    switch (opcionAspirarYLimpiar) {
                        //Completo
                        case 1:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\nVamos a aspirar y "
                                    + "limpiar de forma completa");

                        //Por dependencias
                        case 2:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\nVamos a aspirar y limpiar "
                                    + "por dependencias");
                            int opcionDependenciasAspirarYLimpiar
                                    = Integer.parseInt(
                                            JOptionPane.showInputDialog(
                                                    fecha
                                                    + "\nElija una opci贸n:"
                                                    + "\n1.Habitaci贸n 1"
                                                    + "\n2.Habitaci贸n 2"
                                                    + "\n3.Sal贸n"
                                                    + "\n4.Cocina"
                                                    + "\n5.Ba帽o"
                                                    + "\n6.Salir."));
                            switch (opcionDependenciasAspirarYLimpiar) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de limpiar y "
                                            + "aspirar la habitaci贸n 1.");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de limpiar y "
                                            + "aspirar la habitaci贸n 2.");
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de limpiar y "
                                            + "aspirar el sal贸n.");
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de limpiar y "
                                            + "aspirar la cocina.");
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nEligi贸 la opci贸n "
                                            + "de limpiar y "
                                            + "aspirar el ba帽o.");
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nHasta la pr贸xima.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, fecha
                                            + "\nIntroduzca un valor v谩lido.");
                                    return;

                            }

                        //Salir
                        case 3:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\nHasta la pr贸xima");
                            break;

                    }

                case 3:
                    JOptionPane.showMessageDialog(null, fecha
                            + "\nHasta la pr贸xima");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, fecha
                            + "\nHa introducido un valor incorrecto.");
                    return;

            }
        } else {
            JOptionPane.showMessageDialog(null, fecha + "\nHa introducido "
                    + "datos err贸neos");
        }
        }else{
            System.out.println("Ha introducido un"
                    + " usuario o contrase馻 incorrectos");
        }
    }

}
