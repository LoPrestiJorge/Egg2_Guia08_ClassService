
package guia08_actividadextra02_claseservicio;

import Entidades.NIF;
import Servicios.NifServicios;

public class Guia08_ActividadExtra02_ClaseServicio {

    public static void main(String[] args) {
      NifServicios ns = new NifServicios();
        //Tenes que crear una variable dentro del main para que aloje las funciones que remiten al servicio
        //que a su vez recupera los objetos.
     
        
        NIF nuevoNIF = ns.crearNif();
        
        System.out.println("Resto: " + ns.consultarDNI(nuevoNIF) % 23);
        ns.mostrar(nuevoNIF);
        
    }
    
}
