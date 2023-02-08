/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1= new Vehiculo(1, "mar1", "mod1", 1.0);
        Vehiculo v2= new Vehiculo(2, "mar2", "mod2", 2.0);
        Vehiculo v3= new Vehiculo(3, "mar3", "mod3", 3.0);
        Vehiculo v4= new Vehiculo(4, "mar4", "mod4", 4.0);
        Vehiculo v5= new Vehiculo(5, "mar5", "mod5", 5.0);
        
        Vehiculo []vehiculos= {v1, v2, v3, v4, v5};
        
        LinkedList<Vehiculo> colaVehiculos = new LinkedList<Vehiculo>();
        for(int i=0; i<vehiculos.length; i++){
            colaVehiculos.add(vehiculos[i]);
        }
        
        System.out.println("cv: " + colaVehiculos);
        
        try{
            FileWriter fw = new FileWriter("vehiculos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            
            Iterator<Vehiculo> iv= colaVehiculos.iterator();
            while(iv.hasNext()){
                Vehiculo v= iv.next();
                pw.println(v.getNumPuertas());
                pw.println(v.getMarca());
                pw.println(v.getModelo());
                pw.println(v.getPrecio());
            }
            pw.close();
            
            
            FileReader fr = new FileReader("vehiculos.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            LinkedList<Vehiculo> colaVehiculos2 = new LinkedList<Vehiculo>();
            while((linea=br.readLine())!= null ){
                int npa= Integer.parseInt(linea);
                String mara= br.readLine();
                String moda= br.readLine();
                double prea= Double.parseDouble(br.readLine());
                Vehiculo v6= new Vehiculo(npa, mara, moda, prea);
                System.out.println("v6: " + v6);
                colaVehiculos2.add(v6);
                
                      
            }
            
            System.out.println("lista con la lectura del archivo"+colaVehiculos2);
            boolean iguales=true;
            //.size y .isempty
            while (colaVehiculos.size()!=0&&!colaVehiculos2.isEmpty()) {
				Vehiculo vc1=colaVehiculos.poll();
				Vehiculo vc2=colaVehiculos2.poll();
				if (vc1.compareTo(vc2)!=0) {
					iguales=false;
				}
			}
            if (iguales) {
				System.out.println("son iguales");
			}else {
				System.out.println("son distintos");
			}
            br.close();
            
            
        }catch(IOException ioe){
            System.out.println("Mensaje: " + ioe.getMessage());
        }
    }
    
}
