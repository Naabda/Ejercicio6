//Created by David Abell�n Navarro 1�Dam
//https://github.com/Naabda/Ejercicio6/blob/main/Reforestacion
package EjerciciosEntregados;

import java.util.Scanner;

public class Ejercicio6DavidAbellanNavarro {

	private static Scanner teclado = new Scanner (System.in);
	private static String [] aNombre;
	private static int [] aTama�o;
	private static int [] aDensidad;
	private static int [] aReforestacion;


	private static void nombramiento(int posicion) {

		String nombre;

		for (int i = 0; i < posicion; i++) {
			System.out.println("�Qu� nombre le damos al terreno "+(i+1)+" ?");
			nombre=teclado.next();
			aNombre[i]= nombre;
		}
	}

	private static void asignacion (int aTama�o[], int aDensidad [], int Nterreno) {

		int NDensidad;

		System.out.println("Vamos a definir los terrenos\n");

		//Vamos a asignar valores a las zonas
		for (int i = 0; i < Nterreno; i++) {
			System.out.println("El terreno "+(i+1)+". "+aNombre[i]+"\n");

			System.out.println("�Qu� tama�o tiene?");
			int Tterreno=teclado.nextInt();
			aTama�o [i] = Tterreno;

			System.out.println("�Y su densidad es?");
			NDensidad =teclado.nextInt();
			aDensidad [i]= NDensidad;
		}
	}

	private static void consulterrenos (int aReforestacion[]) {

		int Nterreno;

		System.out.println("N�mero de terreno a consultar");
		Nterreno=teclado.nextInt();
		Nterreno--;
		aReforestacion [Nterreno]= aTama�o [Nterreno]*aDensidad [Nterreno];
		System.out.println("El terreno "+(Nterreno+1)+". "+aNombre[Nterreno]+" hay que reforestarlo con "+aReforestacion[Nterreno]+" �rboles.\n");

	}

	private static void TotalTerrenos (int aReforestacion [], int total) {

		int resultado=0;

		for (int i = 0; i < total; i++) {
			aReforestacion [i]= aTama�o [i]*aDensidad [i];
		}

		for (int i = 0; i < aReforestacion.length; i++) {
			resultado = aReforestacion [i]+resultado;
		}

		System.out.println("Necesitamos "+resultado+" para reforestar el mapa.\n");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que representando la situaci�n copiada en la libreta nos diga la cantidad
		// de �rboles que necesitamos para reforestar cada zona y cuantos �rboles necesitamos en total.

		//Definir mapa.
		System.out.println("Vamos a crear un mapa");
		System.out.println("Dime cuantos terrenos tiene el mapa");
		int Terreno = teclado.nextInt();
		aTama�o  = new int [Terreno];
		aDensidad = new int [Terreno];
		aReforestacion =new int [Terreno];
		aNombre =new String [Terreno];
		System.out.println("Tenemos "+Terreno+" terrenos.");
		//Linea control.
		//System.out.println(aTama�o.length+" "+aDensidad.length);

		//Inicializaci�n terrenos a cero.
		for (int i = 0; i < Terreno; i++) {
			aTama�o [i]=0;
			aDensidad [i]=0;
			aReforestacion [i]= (aTama�o [i]=0)*(aDensidad [i]=0);
			aNombre[i]= "Sin nombre";
		}

		//			//Bucle control.
		//			for (int i = 0; i < Terreno; i++) {
		//				System.out.println("El terreno "+i+" tiene el superficie: "+aTama�o[i]);
		//				System.out.println("El terreno "+i+" tiene una densidad: "+aDensidad [i]);
		//			}
		System.out.println();

		//Definimos variables.
		int opcion;
		int Total=Terreno;
		boolean continuar=true;

		//Creamos un men� para poder realizar las acciones m�s facilmente.
		do {
			//Definir opciones men�
			System.out.println("1. Nombre de los terrenos.");
			System.out.println("2. Asignaci�n datos terrenos.");
			System.out.println("3. Consultas terrenos.");
			System.out.println("4. Consulta total �rboles.");
			System.out.println("5. Salir.");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				nombramiento (Terreno);
				break;

			case 2:

				asignacion (aTama�o, aDensidad, Terreno);

				//					//Bucle control.
				//					for (int i = 0; i < Terreno; i++) {
				//						System.out.println("El terreno "+i+" tiene el superficie: "+aTama�o[i]);
				//						System.out.println("El terreno "+i+" tiene una densidad: "+aDensidad [i]);
				//					}

				break;

			case 3:

				consulterrenos (aReforestacion);

				break;

			case 4:

				TotalTerrenos (aReforestacion, Total);

				break;

			case 5:

				continuar = false;
				break;

			default:

				System.out.println("Inserte una opci�n correcta");
				break;

			}
		}
		while (continuar);

	}

}



