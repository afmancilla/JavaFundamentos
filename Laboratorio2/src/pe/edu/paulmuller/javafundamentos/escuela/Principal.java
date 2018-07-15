package pe.edu.paulmuller.javafundamentos.escuela;

public class Principal {

	public static void main(String[] args) {
		
		//Creación atributos Alumno
		 String codigo_alumno;
		 String nombre_alumno;        
         String apellido_alumno;
         int edad_alumno;
         
         //Creación atributos Profesor         
         String codigo_profesor;
		 String nombre_profesor;        
         String apellido_profesor;
         int edad_profesor;
         String curso_profesor;

         //Asignación de valores para el Alumno
         codigo_alumno = "ALUMNO2018001";
         nombre_alumno = "Juan";
         apellido_alumno = "Perez";
         edad_alumno = 18;
                 
         //Asignación de valores para el Profesor
         codigo_profesor = "PROFESOR201817";
		 nombre_profesor = "Alex";        
         apellido_profesor = "Mancilla";
         edad_profesor = 35;
         curso_profesor = "Java Fundamentos";
         
         //Creacipon de Objetos Juan Perez
         Alumno alumno1 = new Alumno();
         alumno1.setCodigo(codigo_alumno);
         alumno1.setNombre(nombre_alumno);
         alumno1.setApellido(apellido_alumno);
         alumno1.setEdad(edad_alumno);
         
         //Creacipon de Objetos Alex Mancilla
         Profesor profesor1 = new Profesor();
         profesor1.setCodigo(codigo_profesor);
         profesor1.setNombre(nombre_profesor);
         profesor1.setApellido(apellido_profesor);
         profesor1.setEdad(edad_profesor);
         profesor1.setCurso(curso_profesor);
         
         System.out.println("*** IMPRIMIR DATOS DEL ALUMNO ***");         
         System.out.println(alumno1.getCodigo());
         System.out.println(alumno1.getNombre());
         System.out.println(alumno1.getApellido());
         System.out.println(alumno1.getEdad());
         
         System.out.println("*** IMPRIMIR DATOS DEL PROFESOR ***");         
         System.out.println(profesor1.getCodigo());
         System.out.println(profesor1.getNombre());
         System.out.println(profesor1.getApellido());
         System.out.println(profesor1.getEdad());
         System.out.println(profesor1.getCurso());
	}

}
