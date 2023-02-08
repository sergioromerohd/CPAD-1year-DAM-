package drones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class Main {


	public static void main(String[] args) {
		//creamos los 2 primeros drones
		Dron d1=new Dron(5000); 
		Dron d2= new Dron(10000);
		System.out.println("Aceleracion del motor 1 hasta el maximo y luego el motor2");
		while (d1.getRpmRotor1()!=d1.getRpmRotor1Max()) {
			d1.IncRpmRotor(1);
			System.out.println(d1);
		}
		while (d1.getRpmRotor2()!=d1.getRpmRotor2Max()) {
			d1.IncRpmRotor(2);
			System.out.println(d1);
		}
		/*
		 * tambien podria hacerse acelerando los 2 rotores a la vez
		 */ while (d2.getRpmRotor2()!=d2.getRpmRotor2Max()) {
			d2.IncRpmRotor(3);
			System.out.println(d2);
			}
			
		 /* el problema es que el factor empuje seria demasiado alto ya que es un 2,3^50*/
		
		//creamos d3 y d4
		Dron d3=new Dron();
		Dron d4=new Dron();
		
		//creamos la linked list
		LinkedList<Dron> lld= new LinkedList<>();
		lld.add(d1);
		lld.add(d2);
		lld.add(d3);
		lld.add(d4);
		//mostramos el lld
		for (int i = 0; i < lld.size(); i++) {
            System.out.println(""+(i+1)+" "+lld.get(i));
            
        }
		//eliminamos d3 del lld
		lld.remove(2);
		//mostramos sin el d3
		for (int i = 0; i < lld.size(); i++) {
            System.out.println(""+(i+1)+" "+lld.get(i));      
        }
		//recorrer con un iterador
		Iterator<Dron> it=lld.iterator();
		TreeMap<Integer,Iterator<Dron>> tmd = new TreeMap<>();
		int n=0;
		while(it.hasNext()){
		       System.out.println(it.next());
		       tmd.put(n, it);
		       n++;
		    }
		System.out.println(tmd.values());
	}

}
