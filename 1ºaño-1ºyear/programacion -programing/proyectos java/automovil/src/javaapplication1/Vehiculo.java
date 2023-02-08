/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 026_areinpei
 */
public class Vehiculo implements Comparable<Vehiculo>{
    int numPuertas;
    String marca;
    String modelo;
    double precio;
    
    
    public Vehiculo(int numPuertasp, String marcap, String modelop, double preciop){
        numPuertas=numPuertasp;
        marca= marcap;
        modelo= modelop;
        precio= preciop;
    }
    
    public int getNumPuertas(){
        return numPuertas;
    }
    public double getPrecio(){
        return precio;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    
    @Override
    public String toString(){
        return "NP: " + numPuertas + " Mar: " + marca + " Mod:" + modelo + " Pre: " + precio;
    }
    
    @Override
    public int compareTo(Vehiculo o){
     if (this.getPrecio() < o.getPrecio()){
         return -1;
     }else if (this.getPrecio() > o.getPrecio()){
         return 1;
     }else{
         return 0;
     }
	}

}
