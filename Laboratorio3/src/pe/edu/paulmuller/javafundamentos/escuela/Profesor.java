package pe.edu.paulmuller.javafundamentos.escuela;

public class Profesor extends Persona {

	private String curso;
    
    /*************** CONTRUCTORES *****************/
	public Profesor(String codigo, String nombre, String apellido, int edad, String curso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}
	
	/*************** METODOS DE PROFESOR *****************/
	
	public void EncenderPC() {
		System.out.println("Profesor "+getNombre()+" "+getApellido()+" Prende el CPU y TV.");
		
	}

	public void BorrarPizarra() {
		System.out.println("Profesor "+getNombre()+" "+getApellido()+" Borra la pizarra.");
		
	}
	
	public void explicarClase() {
		System.out.println("Profesor "+getNombre()+" "+getApellido()+" explica la clase.");
		
	}

	public void ApagarPC() {
		System.out.println("Profesor "+getNombre()+" "+getApellido()+" Apaga el CPU y TV.");
		
	}
	
	public void responder(String pregunta) {
		if("encapsulamiento".equals(pregunta)) {
			System.out.println("Es usar SET y GET en las variables del objeto.");
		}else if("constructor".equals(pregunta)) {
			System.out.println("Es un metodo que sirve para crear un objeto.");
		}else {
			System.out.println(" No lo se....");
		}
		
	}
	
	
	public String moverse() {
		return "Trotando...";
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	    
}
