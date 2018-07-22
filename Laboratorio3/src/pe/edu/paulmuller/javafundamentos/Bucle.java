package pe.edu.paulmuller.javafundamentos;

import java.util.Scanner;

public class Bucle {

	public static void main(String[] args) {
		//Objeto para lectura de datos por teclado        
        Scanner input = new Scanner(System.in);
        //Variables
        int dia=1;
        String semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
                          
        //Solicitud de Dia
        System.out.print("DIAS DE LA SEMANA\n"
                + " 1:  Lunes\n"
                + " 2:  Marter\n"
                + " 3:  Miercoles\n"
                + " 4:  Jueves\n"
                + " 5:  Viernes\n"
                + " 6:  Sabado\n"
                + " 7:  Domingo\n"
                + " 0:  Termina la ejecucion\n"
                + " Ingrese numero: ");
        dia = input.nextInt();
        if(dia > 0 || dia < 0)
            System.out.println("\nDía   " + semana[dia-1] + "\n");

	}
}
