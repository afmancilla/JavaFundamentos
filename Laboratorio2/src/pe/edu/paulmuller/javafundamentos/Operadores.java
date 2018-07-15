package pe.edu.paulmuller.javafundamentos;

public class Operadores {

	public static void main(String[] args) {
		
		 	int a = 1 + 2;
	        int b = a * 4;
	        int c = b / 2;
	        int d = c - a;
	        int e = -d;
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);
	        System.out.println("d = " + d);
	        System.out.println("e = " + e);
	        
	        
	        if(a==b){ 
	        	System.out.println("Las variables son iguales");
	        }else{	        	
	        	System.out.println("Las variables son diferentes");	        
	        }
	        
	        System.out.println("================");
	        
	        switch(a){
	        
	            case 1:
	                System.out.println("la variable a tiene el valor de 1");	       
	                break;
	            case 3:
	                System.out.println("la variable a tiene el valor de 3");
	                break;
	            case 5:
	                System.out.println("la variable a tiene el valor de 5");
	                break;
	    }

	}

}
