package pe.edu.paulmuller.javafundamentos.escuela;

public class Alumno extends Persona{

	/*private String codigo;
	private String nombre;
	private String apellido;     
    private int edad;*/
	
	 /*************** CONTRUCTORES *****************/
	 
	public Alumno(String codigo, String nombre, String apellido, int edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	/*************** METODOS DE PROFESOR *****************/
	public void tomarAsiento() {
		System.out.println("Alumno "+getNombre()+" "+getApellido()+" toma asiento.");
		
	}   
	
	public void pregutar(String pregunta) {
		System.out.println("Profesor una pregunta ¿ Que es "+pregunta+" en Java");
		
	}

	public void meditar() {
		System.out.println("A que hora acaba la clase, ya tengo hambre.");
		
	}
	
	public String moverse() {
		return "Saltando...";
	}
	
	/*************** ENCAPSULAMIENTO *****************/
	
	public String getCodigo() {
		return codigo;
	}
	
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
  
}
