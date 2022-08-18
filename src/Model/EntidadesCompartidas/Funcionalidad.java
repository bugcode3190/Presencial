package Model.EntidadesCompartidas;

import java.util.ArrayList;

public class Funcionalidad {
	
	private String nombre;
	private String descripcion;
	private ArrayList<Rol> roles = new ArrayList();
	
	public boolean acceso(Persona persona) {		
		return roles.contains(persona.getRol());
	}
}
