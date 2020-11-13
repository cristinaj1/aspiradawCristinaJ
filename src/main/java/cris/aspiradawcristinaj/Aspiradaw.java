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

        //Creamos una variable para la batería inicializada en 0.
        int carga;

        //Para la hora y fecha.
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);

        //Intro al programa.
        JOptionPane.showMessageDialog(null, "Bienvenido a tu robot de limpieza "
                + "favorito.");

        //Pedimos usuario y contraseña.
        final String USUARIO = "usuario";
        final String CONTRASENA = "usuario";
        String entrar1 = JOptionPane.showInputDialog(fecha 
                + "\nIntroduzca usuario");
        String entrar2 = JOptionPane.showInputDialog(fecha 
                + "\nIntroduzca contraseña");
        if(USUARIO != entrar1 && CONTRASENA != entrar2){
        
        
        //Para que el usuario ponga la batería del robot.
        int cargainicio = Integer.parseInt(JOptionPane.showInputDialog( fecha 
                + "\n¿Cuanta batería tengo?"));
        carga = 0 + cargainicio;   
               
                
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
            int opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(fecha + "\nElija una opción:"
                    + "\n1.Apiración"
                    + "\n2.Aspiración y fregado"
                    + "\n3.Salir."));
            switch (opcionPrincipal) {

                //Opción de Aspirar
                case 1:

                    int opcionAspirar = Integer.parseInt(
                            JOptionPane.showInputDialog(fecha + "\n"  + carga 
                                    + "\n5" + "\nsuma" 
                                    + "\nElija una opción:"
                                    + "\n1.Completo"
                                    + "\n2.Dependencias"
                                    + "\n3.Salir."));

                    switch (opcionAspirar) {
                        //Completo
                        case 1:
                         double restaAspiracion1 = (1.5 * habitacion1) - habitacion1;
                         double restaCarga1 = carga - restaAspiracion1;
                         
                         if(restaCarga1 <= 3){
                             JOptionPane.showMessageDialog(null,fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados."
                                     + "\nRobot: Me voy a mi "
                                     + "base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1");
                             carga = 100;
                         }else{
                         double restaAspiracion2 = ((1.5 * habitacion2) - habitacion2) + restaAspiracion1;
                         double restaCarga2 = carga - restaAspiracion2;
                         
                         if(restaCarga2 <= 3){
                             JOptionPane.showMessageDialog(null,fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados."
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1 y 2");
                          carga = 100;
                         }else{
                         double restaAspiracion3 = ((1.5 * cocina) - cocina) + restaAspiracion2;
                         double restaCarga3 = carga - restaAspiracion3;
                         
                         if(restaCarga3 <= 3){
                             JOptionPane.showMessageDialog(null,fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados."
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1, 2 "
                                     + "y cocina");
                          carga = 100;
                         }else{
                         double restaAspiracion4 = ((1.5 * salon) - salon) + restaAspiracion3;
                         double restaCarga4 = carga - restaAspiracion4;
                         
                         if(restaCarga4 <= 3){
                             JOptionPane.showMessageDialog(null,fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados."
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1, 2 "
                                     + ",cocina y salon");
                          carga = 100;
                         }else{
                         double restaAspiracion5 = ((1.5 * bano) - bano) + restaAspiracion4;
                         double restaCarga5 = carga - restaAspiracion5;
                         
                         if(restaCarga5 <= 3){
                             System.out.println(fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados."
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Ya limpié toda la casa");
                          carga = 100;
                         }else{
                             
                         }
                         } 
                         } 
                         }
                         }
                        
                            
                        //System.out.println("El robot está en la habitación " + 
                        


                        //Por dependencias
                        case 2:
                            int opcionDependenciasAspirar
                                    = Integer.parseInt(
                                            JOptionPane.showInputDialog(
                                                    fecha + "\n"  + carga + "\n5" 
                                                    + "\n" + suma + " metros cuadrados."
                                                    + "\nElija una opción:"
                                                    + "\n1.Habitación 1"
                                                    + "\n2.Habitación 2"
                                                    + "\n3.Salón"
                                                    + "\n4.Cocina"
                                                    + "\n5.Baño"
                                                    + "\n6.Salir."));
                            switch (opcionDependenciasAspirar) {

                                case 1:
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de aspirar "
                                            + "la habitación 1.");
                                    double resta2 = (1.5 * habitacion1) - habitacion1;
                                    if(resta2 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de aspirar"
                                            + " la habitación 2.");
                                    double resta3 = (1.5 * habitacion2) - habitacion2;
                                    if(resta3 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de aspirar el salón.");
                                    double resta4 = (1.5 * salon) - salon;
                                    if(resta4 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de aspirar la cocina.");
                                    double resta5= (1.5 * cocina) - cocina;
                                    if(resta5 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de aspirar el baño.");
                                    double resta6 = (1.5 * bano) - bano;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nHasta la próxima.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nIntroduzca un valor válido.");
                                    return;

                            }


                        //Salir
                        case 3:
                            JOptionPane.showMessageDialog(null, fecha 
                                    + "\n"  + carga + "\n5" 
                                    + "\n" + suma + " metros cuadrados."
                                    + "\nHasta la próxima");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, fecha
                                    + "\n"  + carga + "\n5" 
                                    + "\n" + suma + " metros cuadrados."
                                    + "\nHa introducido datos erróneos");
                            return;

                    }

                //Opcioón aspirar y limpiar.
                case 2:

                    int opcionAspirarYLimpiar = Integer.parseInt(JOptionPane.showInputDialog(
                            fecha + "\n"  + carga + "\n5" 
                            + "\n" + suma + " metros cuadrados."
                            + "\nElija una opción:"
                            + "\n1.Completo"
                            + "\n2.Dependencias"
                            + "\n3.Salir."));
                    switch (opcionAspirarYLimpiar) {
                        //Completo
                        case 1:
                            JOptionPane.showMessageDialog(null, fecha 
                                    + "\n"  + carga + "\n5 dependencias" 
                                    + "\n" + suma + " metros cuadrados."
                                    + "\nVamos a aspirar y "
                                    + "limpiar de forma completa");
                            double restaAspiracionYLimpieza1 = (2.25 * habitacion1) - habitacion1;
                         double restaCarga6 = carga - restaAspiracionYLimpieza1;
                         
                         if(restaCarga6 <= 3){
                             JOptionPane.showMessageDialog(null, fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados." 
                                     + "\nRobot: Me voy a mi "
                                     + "base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1");
                             carga = 100;
                         }else{
                         double restaAspiracionYLimpieza2 = ((2.25 * habitacion2) - habitacion2) + restaAspiracionYLimpieza1;
                         double restaCarga7 = carga - restaAspiracionYLimpieza2;
                         
                         if(restaCarga7 <= 3){
                             JOptionPane.showMessageDialog(null,fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados." 
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1 y 2");
                          carga = 100;
                         }else{
                         double restaAspiracionYLimpieza3 = ((2.25 * cocina) - cocina) + restaAspiracionYLimpieza2;
                         double restaCarga8 = carga - restaAspiracionYLimpieza3;
                         
                         if(restaCarga8 <= 3){
                             JOptionPane.showMessageDialog(null, fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados." 
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1, 2 "
                                     + "y cocina");
                          carga = 100;
                         }else{
                         double restaAspiracionYLimpieza4 = ((2.25 * salon) - salon) + restaAspiracionYLimpieza3;
                         double restaCarga9 = carga - restaAspiracionYLimpieza4;
                         
                         if(restaCarga9 <= 3){
                             JOptionPane.showMessageDialog(null, fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados." 
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Hasta ahora limipié solo la habitación 1, 2 "
                                     + ",cocina y salon");
                          carga = 100;
                         }else{
                         double restaAspiracionYLimpieza5 = ((2.25 * bano) - bano) + restaAspiracionYLimpieza4;
                         double restaCarga10 = carga - restaAspiracionYLimpieza5;
                         
                         if(restaCarga10 <= 3){
                             JOptionPane.showMessageDialog(null, fecha + "\n"  + carga + "\n5" 
                                     + "\n" + suma + " metros cuadrados." 
                                     + "\nRobot: Me voy a "
                                     + "mi base a reponer batería\n"
                                     + "Ya limpié toda la casa");
                          carga = 100;
                         }else{
                             
                         }
                         } 
                         } 
                         }
                         }

                        //Por dependencias
                        case 2:
                            JOptionPane.showMessageDialog(null, fecha + "\n"  
                                    + carga + "\n5" + "\n" + suma 
                                    + " metros cuadrados."
                                    + "\nVamos a aspirar y limpiar "
                                    + "por dependencias");
                            int opcionDependenciasAspirarYLimpiar
                                    = Integer.parseInt(
                                            JOptionPane.showInputDialog(
                                                    fecha + "\n"  + carga + "\n5" 
                                                    + "\n" + suma + " metros cuadrados."
                                                    + "\nElija una opción:"
                                                    + "\n1.Habitación 1"
                                                    + "\n2.Habitación 2"
                                                    + "\n3.Salón"
                                                    + "\n4.Cocina"
                                                    + "\n5.Baño"
                                                    + "\n6.Salir."));
                            switch (opcionDependenciasAspirarYLimpiar) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de limpiar y "
                                            + "aspirar la habitación 1.");
                                    double resta7 = (2.25 * habitacion1) - habitacion1;
                                    if(resta7 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de limpiar y "
                                            + "aspirar la habitación 2.");
                                    double resta8 = (2.25 * habitacion2) - habitacion2;
                                    if(resta8 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }

                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de limpiar y "
                                            + "aspirar el salón.");
                                    
                                    double resta9 = (2.25 * salon) - salon;
                                    
                                    if(resta9 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }


                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de limpiar y "
                                            + "aspirar la cocina.");
                                    
                                    double resta10 = (2.25 * cocina) - cocina;
                                    
                                    if(resta10 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    
                                    carga = 100;
                                    }


                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nEligió la opción "
                                            + "de limpiar y "
                                            + "aspirar el baño.");
                                    
                                    double resta11 = (2.25 * bano) - bano;
                                    
                                    if(resta11 <= 3){
                                    JOptionPane.showMessageDialog(null,fecha 
                                            + "\n"  + carga + " %\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nUy, no tengo batería, me voy a mi base." );
                                    carga = 100;
                                    }

                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nHasta la próxima.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, fecha 
                                            + "\n"  + carga + "\n5" 
                                            + "\n" + suma + " metros cuadrados."
                                            + "\nIntroduzca un valor válido.");
                                    return;

                            }

                        //Salir
                        case 3:
                            JOptionPane.showMessageDialog(null, fecha 
                                    + "\n"  + carga + "\n5" 
                                    + "\n" + suma + " metros cuadrados."
                                    + "\nHasta la próxima");
                            break;

                    }

                case 3:
                    JOptionPane.showMessageDialog(null, fecha + "\n" 
                            + carga + "\n5" + "\n" + suma + " metros cuadrados."
                            + "\nHasta la próxima");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, fecha + "\n"  
                            + carga + "\n5" + "\n" + suma + " metros cuadrados."
                            + "\nHa introducido un valor incorrecto.");
                    return;

            }
        } else {
            JOptionPane.showMessageDialog(null, fecha + "\n"  + carga + "\n5"
                    + "\nHa introducido "
                    + "datos erróneos");
        }
        }else{
            JOptionPane.showMessageDialog(null, fecha + "\nHa introducido "
                    + "datos erróneos");
        }
    }

}
