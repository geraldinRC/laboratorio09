/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09ejemplo01;

/**
 *
 * @author 
 */
public class enemigo extends juego {
    public float posx = 410;
    public int dir = 1;

    public enemigo(int enemigo, int balita, int tanque) {
        super(enemigo, balita, tanque);
    }

  

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }
    
    
}
