/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09ejemplo01;

/**
 *
 * @author 
 */
public class juego {
        public int enemigo ;
    public int balita ;
    public int tanque ;
     public juego(int enemigo, int balita, int tanque) {
        this.enemigo = enemigo;
        this.balita = balita;
        this.tanque = tanque;
       
    }

    public int getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(int enemigo) {
        this.enemigo = enemigo;
    }

    public int getBalita() {
        return balita;
    }

    public void setBalita(int balita) {
        this.balita = balita;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

   
    
    
}
