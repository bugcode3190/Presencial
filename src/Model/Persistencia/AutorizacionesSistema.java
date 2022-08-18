package Model.Persistencia;

import Model.EntidadesCompartidas.Funcionalidad;
import Model.EntidadesCompartidas.Persona;
import Model.EntidadesCompartidas.Rol;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AutorizacionesSistema {
	
	private Connection databaseConnection = DatabaseManager.getConnection();
	
	public void asignarRolPersona(String documento, Rol rol) {
		try {
			String consulta = "select * from PERSONAS where DOCUMENTO = '" + documento  + "'" ;
			Statement sentencia = databaseConnection.createStatement();
			ResultSet resultado = sentencia.executeQuery(consulta);

			if(resultado.next()) {
				Persona persona = new Persona(resultado.getNString("DOCUMENTO"));

				persona.setRol(rol);

				String update = "update PERSONAS set ID_ROL = " + (persona.getRol().ordinal() + 1) + " where DOCUMENTO = '" + persona.getDocumento() + "'";
				sentencia.executeQuery(update);
				System.out.println("Modificacion con exito");
			}
			else
				System.out.println("no encontrado");
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la base de datos:");
			e.printStackTrace();
		}
	}
	
	public void asignarFuncionalidadesRol(ArrayList<Funcionalidad> funcionalidades, Rol rol) {
		
	}

	public void funcionalidadesPermitidas(Persona persona) {
		
	}
	
}
