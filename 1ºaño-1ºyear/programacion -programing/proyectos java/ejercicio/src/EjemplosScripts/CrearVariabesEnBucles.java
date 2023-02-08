package EjemplosScripts;

public class CrearVariabesEnBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generar una variable con valor[] que sera un nuevo int de 6 diferentes valores y generamos X
		int variable[] = new int[7],x=2;
		//i tiene que llegar a uno menos que el new int
		for(int i=1; i<=6; i++ )
		{
			//llamar a la variable[i]y ponerle el valor de X
		variable[i] = x;
			
		System.out.println("Varible[" + i + "] = " + variable[i] );
		
		x=x*2;
		}
		//se puede mostrar cualquier valor de variable[i]
		System.out.println(variable[3]);
	}

}
