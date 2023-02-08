/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miclase;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author 026_areinpei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> hss= new HashSet<>();
        HashSet<Integer> hsi= new HashSet<>();

        hss.add("Xiaomi");
        Integer i1 =1;
        int i2 =2;
        hsi.add(i1);
        hss.add("Samsung");
        boolean b= hss.add("Oppo");
        System.out.println("b: " + b);
        
        System.out.println("hss size: " + hss.size());
        System.out.println("hss empty: " + hss.isEmpty());
        System.out.println("hss contains hola?: " + hss.contains("Hola"));
        System.out.println("hss contains Oppo?: " + hss.contains("Oppo"));
        
        if( hss.contains("Oppo1") ){
            System.out.println("hss contains Oppo1");
        }else{
            System.out.println("hss doesn't contain Oppo1");
        }
        b= hss.add("Oppo");
        System.out.println("b: " + b);
        System.out.println(hss);
        
        LinkedHashSet<MiClase> lhs = new LinkedHashSet<>();
        MiClase mc1= new MiClase();
        MiClase mc2= new MiClase(5, "seis");
        MiClase mc3= new MiClase(5, 8, "seis", "ocho");
        
        lhs.add(mc1);
        lhs.add(mc2);
        lhs.add(mc3);
        //lhs.add(new Integer(2));
        
        System.out.println(lhs);
        
        lhs.add(mc3);
        System.out.println(lhs);
        lhs.add(new MiClase());
        System.out.println(lhs);
        
        //Incrementar en uno el atributo ai de todos los
        //elementos del conjunto lhs
        Iterator<MiClase> imc= lhs.iterator();
        while(imc.hasNext()){
            MiClase e= imc.next();
            e.setAi(e.getAi()+1);
        }
        System.out.println(lhs);
        
        TreeSet<Integer> tsi = new TreeSet<>();
        
        tsi.add (40);
        tsi.add(25);
        tsi.add((int)28.9);
        tsi.add(1);
        tsi.add(0);
        tsi.add(2);
        tsi.add(2);
        
        
        System.out.println(tsi);
        System.out.println("menor: " + tsi.floor(2));
        System.out.println("menor: " + tsi.ceiling(26));
        System.out.println("menor: " + tsi.first());

        Iterator<Integer> itsi= tsi.iterator();
        int suma=0;
        while(itsi.hasNext()){
            Integer vi= itsi.next();
            suma+= vi;
            
        }
        System.out.println(tsi);
        System.out.println("Suma: " + suma);
        
        TreeSet<MiClase> tsmc = new TreeSet<>();
       
        MiClase mc6= new MiClase(15, "ocho");
        MiClase mc5= new MiClase(5, "seis");
        MiClase mc4= new MiClase(1, "siete");
  
        
        /*
        tsmc.add(mc4);
        tsmc.add(mc5);
        tsmc.add(mc6);
        System.out.println(tsmc);
        */
        
        
        TreeSet<MiClase> tsmc2 = new TreeSet<>(Comparator.comparingInt(MiClase::getAi));
        tsmc2.add(mc4);
        tsmc2.add(mc5);
        tsmc2.add(mc6);
        System.out.println(tsmc2);

        
        MiClase2 mc26= new MiClase2(15, "ocho");
        MiClase2 mc25= new MiClase2(5, "seis");
        MiClase2 mc24= new MiClase2(1, "siete");

        
        TreeSet<MiClase2> tsmc3 = new TreeSet<>();
        tsmc3.add(mc24);
        tsmc3.add(mc25);
        tsmc3.add(mc26);
        System.out.println(tsmc3);
  
  
        //comparar
        
        
        MiClase6 mc61= new MiClase6(1, "uno");
        MiClase6 mc62= new MiClase6(2, "dos");
        MiClase6 mc63= new MiClase6(3, "tres");

        
        TreeSet<MiClase6> tsmc6 = new TreeSet<>();
        tsmc6.add(mc62);
        tsmc6.add(mc63);
        tsmc6.add(mc61);
        System.out.println(tsmc6);
        
        
    }
    
}
