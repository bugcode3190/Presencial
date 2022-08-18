package Model.EntidadesCompartidas;

import java.util.Date;

public class Persona {

	private String documento;
	private String apellido1;
	private String apellido2;
	private String nombre1;
	private String nombre2;
	private Date fechaNac;
	private String clave;
	private String mail;
	private Rol rol;
	
	public Persona(String documento, String apellido1, String apellido2, String nombre1, String nombre2, Date fechaNac,
			String clave, String mail, Rol rol) {
		this.setDocumento(documento);
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.fechaNac = fechaNac;
		this.clave = clave;
		this.mail = mail;
		this.rol = rol;
	}
	public Persona(){

	}

	public Persona(String documento) {
		this.setDocumento(documento);
	}

	public Rol getRol() {
		return rol;
	}
	
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
}
