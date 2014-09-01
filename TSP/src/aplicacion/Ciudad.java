/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Neko
 */
public class Ciudad {
    private int id;
    private int x;
    private int y;
    
    public Ciudad(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "C" + this.id + "(" + this.x + "," + this.y + ")";
    }
    
    public double distancia(Ciudad a){
        return Math.sqrt(Math.pow(this.x-a.getX(),2)+Math.pow(this.y-a.getY(),2));
    }
}
