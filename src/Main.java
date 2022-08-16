import Model.Rol;

import java.sql.Connection;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        AutorizacionesSistema ingreso = new AutorizacionesSistema();

        ingreso.asignarRolPersona("46916451", Rol.JEFE);

    }
}



