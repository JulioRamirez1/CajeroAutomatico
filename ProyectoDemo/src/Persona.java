
public class Persona {
	private String nombre;
	private String apellidod;
	private int edad;
	private int dni;
	
	public Persona() {
	}

	public Persona(String nombre, String apellidod, int edad, int dni) {
		this.nombre = nombre;
		this.apellidod = apellidod;
		this.edad = edad;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidod() {
		return apellidod;
	}
	public void setApellidod(String apellidod) {
		this.apellidod = apellidod;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
		
}
