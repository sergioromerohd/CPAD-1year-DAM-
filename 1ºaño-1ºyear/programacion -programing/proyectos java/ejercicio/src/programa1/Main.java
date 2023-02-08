/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 026_areinpei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> ali= new ArrayList<>();
        
        Scanner t = new Scanner(System.in);
        
        ali.add(1);
        ali.add(0);
        ali.add(20);
        ali.add(1);
        System.out.println("ali: " + ali);

        
        //Crear un AL de objetos tipo String
        ArrayList<String> als= new ArrayList<>();
        //Añadir "hola" "Pepe" "UAX"
        boolean fin=true;
        System.out.println("Introduce un texto");
        while (fin) {
        	String x=t.next();
        	if (x.equals("fin")) {
				fin=false;
			} else {
				als.add(x);
				System.out.println("Introduce otra cadena de texto, si pones fin finaliza");
			}
		}
                
        //Obtener el número de elementos de la lista
        System.out.println("num elementos: " + als.size());
               
        //Comprobar que la lista contiene "UAX"
        System.out.println("als contiene UAX ?: " + als.contains("UAX"));
        
        //Comprobar que la lista contiene "UCLA"
        if(als.contains("UCLA")){
            System.out.println("als contiene UCLA");
        }else{
            System.out.println("als no contiene UCLA");
        }

        //Obtener un iterador para la lista y recorrerla con
        //el iterador
        
        System.out.println("****suma total*****");
        Iterator<String> is= als.iterator();
        int i=0;
        int suma=0;
        while(is.hasNext()){
            suma+=is.next().length();
        }
        
        
        ArrayList<Integer> als2= new ArrayList<>();
        
        Iterator<String> is2= als.iterator();
        while(is2.hasNext()){
        	
        	als2.add(is2.next().length());
            
        }
        
        System.out.println(suma);
        
        System.out.println("****Introducido*****");
        for(i=0; i<als.size(); i++){
            System.out.println("Elemento " + i + ": " + als.get(i));
        }
       
        System.out.println("***Longitud de cada string******");
        i=0;
        for(Integer c: als2){
            System.out.println("Elemento " + i++ + ": " + c);
        }
        
        
        
    }
    
}
