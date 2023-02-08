package automoviles;

import java.util.HashSet;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		 automovil a1=new automovil();
		 
		 System.out.println(a1);
		 System.out.println("aceleramos a1");
		 while (a1.getVelocidad()<100) {
			a1.acelerar(a1.getVelocidad());
			System.out.println(a1.getVelocidad());
		}
		 System.out.println("frenamos a1");
		 while (a1.getVelocidad()>0) {
				a1.frenar(a1.getVelocidad());
				System.out.println(a1.getVelocidad());
			}
		 automovil a2=new automovil(5,'h',80);
		 System.out.println(a2);
		 automovil a3=new automovil();
		 System.out.println(a3);
		 automovil a4=new automovil();
		 System.out.println(a4);
		 
		 HashSet<automovil> hsa = new HashSet();
		 hsa.add(a1);
		 hsa.add(a2);
		 hsa.add(a3);
		 hsa.add(a4);
		 //¿Cuántos objetos se insertarán en el conjunto? ¿Por qué?
		 
		 // se meten 2 ya que el a1 a3 y a4 tienen los mismos valores
		 HashSet<automovil> hsb = new HashSet();
		 hsa.add(a1);
		 hsa.add(a2);
		 
		 TreeMap<String,HashSet> tra = new TreeMap<>();
		 
	}

}
