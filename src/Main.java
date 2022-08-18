import Model.Persistencia.AutorizacionesSistema;
import Model.EntidadesCompartidas.Funcionalidad;
import Model.EntidadesCompartidas.Persona;
import Model.EntidadesCompartidas.Rol;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Persona  persona1 = new Persona();

        Funcionalidad funcionalidad1 = new Funcionalidad();

        ArrayList<Funcionalidad> funcionalidades1 = new ArrayList<>();

        funcionalidades1.add(funcionalidad1);

        AutorizacionesSistema ingreso = new AutorizacionesSistema();

        ingreso.asignarRolPersona("46916451", Rol.ADMINISTRADOR);

        ingreso.funcionalidadesPermitidas(persona1);

        ingreso.asignarFuncionalidadesRol(funcionalidades1,Rol.JEFE );

    }
}



