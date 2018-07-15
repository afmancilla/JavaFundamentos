package pe.edu.paulmuller.javafundamentos;

public class Primitivo {

    /**
     * 4 tipos de variables son numeros enteras con signo
     *
     * byte, Entero con signo 8 bits, [-128,127]
     * short,Entero con signo 16 bits, [-32768,32767]
     * int,   Entero con signo 32 bits, [-32768,32767]
     * long) Entero con signo 64 bits, [-32768,32767]
     *
     * caracteristicas:
     *  - Por defecto se inicializan en cero
     *  - son variables primitivos es decir almacenan el dato directamente
     *
     */
	public static void main(String[] args) {
		//01-Variables byte
        byte b1 = 127;
        System.out.println("----- byte -----");
        System.out.println("Variable del tipo byte:" + b1);
        
        //Variables short
        short s1 = 2;
        System.out.println("----- short -----");
        System.out.println("Variable del tipo short:" + s1);
        
      //Variable enteras
        int e1 = 100;
        System.out.println("----- int -----");
        System.out.println("Variable del tipo int:" + e1);
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("----- long -----");
        System.out.println("Variable del tipo long:" + long1);
        System.out.println("Variable del tipo long:" + long2);
        
	}

}
