/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.List;

/**
 *
 * @author Neko
 */
public class TSP {
    private List<Ciudad> ciudades;
    private int id;
    
    public TSP(int id, List<Ciudad> ciudades){
        this.id = id;
        this.ciudades = ciudades;
    }
    
    @Override
    public String toString(){
        return "TSP N°" + id + " " + ciudades + "} = " + this.getFitness();
    }
    
    public double getFitness(){
        double salida =0.0;
        
        for (int i=0; i < ciudades.size()-1; i++){
            salida += ciudades.get(i).distancia(ciudades.get(i+1));
        }
        salida += ciudades.get(0).distancia(ciudades.get(ciudades.size()-1));
        
        return salida;
    }
}


