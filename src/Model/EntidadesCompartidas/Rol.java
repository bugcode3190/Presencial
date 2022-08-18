package Model.EntidadesCompartidas;

public enum Rol {
	ADMINISTRADOR("Administrador", "Administrador de sistema"),
	JEFE("Jefe", "Jefe de sección"),
	OPERADOR("Operador", "Operador de sección");

	private String nombre;
	private String descripcion;
	
	private Rol(String nombre, String descripcion) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
	}

	public static Rol getRol(String nombre) {
		switch (nombre) {
			case "Administrador" : return ADMINISTRADOR;
			case "Jefe" : return JEFE;
			case "Operador" : return OPERADOR;
			default : return null;
		}			
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
