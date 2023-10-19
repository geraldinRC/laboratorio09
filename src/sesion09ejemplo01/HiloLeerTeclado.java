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
public class HiloLeerTeclado extends Thread{

    @Override
    public void run() {
        super.run(); 
        Scanner sc = new Scanner(System.in);
        
        String digito = sc.nextLine();
        //if(digito.equalsIgnoreCase("w")){
        //    Sesion09Ejemplo01.tanqPos1Y--;
        //    Sesion09Ejemplo01.tanqPos2Y--;
        //    Sesion09Ejemplo01.tanqPos3Y--;
        //    Sesion09Ejemplo01.tanqPos4Y--;
        //    Sesion09Ejemplo01.tanqPos5Y--;
        //    Sesion09Ejemplo01.tanqPos6Y--;
        //    Sesion09Ejemplo01.tanqPos7Y--;
        //}

        if(digito.equalsIgnoreCase("s")){
            laboratorio09.tanqPos1Y++;
            laboratorio09.tanqPos2Y++;
            laboratorio09.tanqPos3Y++;
            laboratorio09.tanqPos4Y++;
            laboratorio09.tanqPos5Y++;
            laboratorio09.tanqPos6Y++;
            laboratorio09.tanqPos7Y++;
        }

        if(digito.equalsIgnoreCase("d")){
            laboratorio09.tanqPos1X++;
            laboratorio09.tanqPos2X++;
            laboratorio09.tanqPos3X++;
            laboratorio09.tanqPos4X++;
            laboratorio09.tanqPos5X++;
            laboratorio09.tanqPos6X++;
            laboratorio09.tanqPos7X++;
        }

        if(digito.equalsIgnoreCase("a")){
            laboratorio09.tanqPos1X--;
            laboratorio09.tanqPos2X--;
            laboratorio09.tanqPos3X--;
            laboratorio09.tanqPos4X--;
            laboratorio09.tanqPos5X--;
            laboratorio09.tanqPos6X--;
            laboratorio09.tanqPos7X--;
        }
    }
    
    
    
}
