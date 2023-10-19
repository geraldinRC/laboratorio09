/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09ejemplo01;

import java.util.Scanner;

/**
 *
 * @author
 */
public class HiloActualizaPantalla extends Thread {

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").
                    inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error clearing the screen: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        super.run();
        Scanner sc = new Scanner(System.in);
        while (true) {
            clearScreen();
            for (int i = 0; i < 60; i++) {
                for (int j = 0; j < 100; j++) {

                    if ((laboratorio09.tanqPos1X == j
                            && laboratorio09.tanqPos1Y == i)
                            || (laboratorio09.tanqPos2X == j
                            && laboratorio09.tanqPos2Y == i)
                            || (laboratorio09.tanqPos3X == j
                            && laboratorio09.tanqPos3Y == i)
                            || (laboratorio09.tanqPos4X == j
                            && laboratorio09.tanqPos4Y == i)
                            || (laboratorio09.tanqPos5X == j
                            && laboratorio09.tanqPos5Y == i)
                            || (laboratorio09.tanqPos6X == j
                            && laboratorio09.tanqPos6Y == i)
                            || (laboratorio09.tanqPos7X == j
                            && laboratorio09.tanqPos7Y == i)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.print("\n");
            }
            try {
                Thread.sleep(100);
            } catch (Exception s) {
            }

        }
    }

//    String digito = sc.nextLine();
//            if(digito.equalsIgnoreCase("w")){
//                Sesion09Ejemplo01.tanqPos1Y--;
//                Sesion09Ejemplo01.tanqPos2Y--;
//                Sesion09Ejemplo01.tanqPos3Y--;
//                Sesion09Ejemplo01.tanqPos4Y--;
//                Sesion09Ejemplo01.tanqPos5Y--;
//                Sesion09Ejemplo01.tanqPos6Y--;
//                Sesion09Ejemplo01.tanqPos7Y--;
//            }
//            
//            if(digito.equalsIgnoreCase("s")){
//                Sesion09Ejemplo01.tanqPos1Y++;
//                Sesion09Ejemplo01.tanqPos2Y++;
//                Sesion09Ejemplo01.tanqPos3Y++;
//                Sesion09Ejemplo01.tanqPos4Y++;
//                Sesion09Ejemplo01.tanqPos5Y++;
//                Sesion09Ejemplo01.tanqPos6Y++;
//                Sesion09Ejemplo01.tanqPos7Y++;
//            }
//            
//            if(digito.equalsIgnoreCase("d")){
//                Sesion09Ejemplo01.tanqPos1X++;
//                Sesion09Ejemplo01.tanqPos2X++;
//                Sesion09Ejemplo01.tanqPos3X++;
//                Sesion09Ejemplo01.tanqPos4X++;
//                Sesion09Ejemplo01.tanqPos5X++;
//                Sesion09Ejemplo01.tanqPos6X++;
//                Sesion09Ejemplo01.tanqPos7X++;
//            }
//            
//            if(digito.equalsIgnoreCase("a")){
//                Sesion09Ejemplo01.tanqPos1X--;
//                Sesion09Ejemplo01.tanqPos2X--;
//                Sesion09Ejemplo01.tanqPos3X--;
//                Sesion09Ejemplo01.tanqPos4X--;
//                Sesion09Ejemplo01.tanqPos5X--;
//                Sesion09Ejemplo01.tanqPos6X--;
//                Sesion09Ejemplo01.tanqPos7X--;
//            }
}
