package pe.edu.paulmuller.javafundamentos.escuela;

public class Clase {
	
	private static Profesor profe;
	private static Alumno alumno1,alumno2,alumno3;
	

	public static void main(String[] args) {
		iniciarClase();
		dictarClase();
		finalizarClase();
	}

	private static void iniciarClase() {
		
		System.out.println("********** INCIO DE LA CLASE *******************");
		//Para dictar una clase necesitamos de un profesor
		profe = new Profesor("NI27", "Alex", "Mancilla", 35, "Java Fundamentos");
		//Se necesita alumnos
		alumno1 = new Alumno("1","Juan", "Perez", 15);
		alumno2 = new Alumno("2","Jorge", "Santana", 19);
		alumno3 = new Alumno("3","Rosa", "Carrazco", 20);
		
		profe.BorrarPizarra();
		profe.EncenderPC();
				
		alumno1.tomarAsiento();
		alumno2.tomarAsiento();
		alumno3.tomarAsiento();				
		
	}
	
	private static void dictarClase() {
		
	System.out.println("********** CLASE EN CURSO *******************");
       profe.explicarClase();
       alumno1.pregutar("constructor");
       profe.responder("constructor");       
       alumno2.pregutar("encapsulamiento");
       profe.responder("encapsulamiento");
       alumno3.meditar();
       		
	}

	private static void finalizarClase() {
		System.out.println("********** FIN DE LA CLASE *******************");		
		profe.ApagarPC();
		profe.BorrarPizarra();
		profe.salirSalon(profe);
		alumno1.salirSalon(alumno1);
		alumno2.salirSalon(alumno2);
		alumno3.salirSalon(alumno3);
		
	}

}
