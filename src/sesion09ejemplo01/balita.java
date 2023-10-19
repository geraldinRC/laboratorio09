/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09ejemplo01;

/**
 *
 * @author 
 */
public class balita extends juego {
     public float posYbalita = 0;
     public  boolean balitaExiste = false;

    public balita(int enemigo, int balita, int tanque) {
        super(enemigo, balita, tanque);
    }

    public float getPosYbalita() {
        return posYbalita;
    }

    public void setPosYbalita(float posYbalita) {
        this.posYbalita = posYbalita;
    }

    public boolean isBalitaExiste() {
        return balitaExiste;
    }

    public void setBalitaExiste(boolean balitaExiste) {
        this.balitaExiste = balitaExiste;
    }


    }

   

