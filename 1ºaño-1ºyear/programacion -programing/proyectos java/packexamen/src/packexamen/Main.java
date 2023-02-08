/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivobinario2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
        File eab = new File("num.dat");

        try {
            FileOutputStream fos = new FileOutputStream(eab);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            
            for(int i=0; i<10; i++){
                dos.writeInt(i);
            }
            
            int arrInt[]= new int[20];
            for(int i=0; i<arrInt.length; i++){
                arrInt[i]=i;
                dos.writeInt(arrInt[i]);
            }
            
            double arrDouble[]= new double[20];
            for(int i=0; i<arrDouble.length; i++){
                arrDouble[i]= i;
                dos.writeDouble(arrDouble[i]);
            }
            
            dos.close();
            FileInputStream fis= new FileInputStream(eab);
            BufferedInputStream bis= new BufferedInputStream(fis);
            DataInputStream dis= new DataInputStream(bis);
            
            int sumaEnteros=0;
            for(int i=0; i<20; i++){
               sumaEnteros+=i;
            }
            System.out.println("La suma tiene que dar: " + sumaEnteros);
            int sumaInt=0;
            
            for(int i=0; i<10; i++){
               sumaInt+=dis.readInt();
            }
            System.out.println("SumaInt: " + sumaInt);
            
            sumaInt=0;
            
            for(int i=0; i<20; i++){
               sumaInt+=dis.readInt();
            }
            System.out.println("SumaInt: " + sumaInt);
            
            double sumaDouble=0.0;
            for(int i=0; i<20; i++){
               sumaDouble+=dis.readDouble();
            }
            dis.close();
            System.out.println("SumaDouble: " + sumaDouble);
            
            
            
            
            
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje: " + ex.getMessage());
        } catch (IOException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje: " + ex.getMessage());
        }
        
        
        
        
        
        
        
    }
    
}
