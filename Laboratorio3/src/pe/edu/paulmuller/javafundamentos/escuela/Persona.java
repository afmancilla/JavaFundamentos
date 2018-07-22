package pe.edu.paulmuller.javafundamentos.escuela;

public class Persona {

	protected String codigo;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public Persona() {
		super();
	}
	
	public void salirSalon(Persona persona) {
		System.out.println(persona.nombre+" "+persona.apellido +"Sale del salon "+persona.moverse());
	}
	
	public String moverse() {
		return "Camininado...";
	};

}