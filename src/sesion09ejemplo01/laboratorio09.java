/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion09ejemplo01;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class laboratorio09 {

    static int tanqPos1X = 50;
    static int tanqPos1Y = 57;

    static int tanqPos2X = 49;
    static int tanqPos2Y = 58;

    static int tanqPos3X = 50;
    static int tanqPos3Y = 58;

    static int tanqPos4X = 51;
    static int tanqPos4Y = 58;

    static int tanqPos5X = 49;
    static int tanqPos5Y = 59;

    static int tanqPos6X = 50;
    static int tanqPos6Y = 59;

    static int tanqPos7X = 51;
    static int tanqPos7Y = 59;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       HiloActualizaPantalla hilo = new HiloActualizaPantalla();
       hilo.start();

       HiloLeerTeclado leer = new HiloLeerTeclado();
       leer.start();
       
    }

    

}
