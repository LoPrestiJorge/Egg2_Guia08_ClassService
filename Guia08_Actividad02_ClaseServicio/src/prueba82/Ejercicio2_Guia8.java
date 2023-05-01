
package prueba82;

import entidades.Cafetera;
import servicios.CafeteraServicio;


public class Ejercicio2_Guia8 {

    /**
     * @param args the command line arguments
     * Programa Nespresso. Desarrolle una
     * clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
     * (la cantidad máxima de café que puede contener la cafetera) y
     * cantidadActual (la cantidad actual de café que hay en la cafetera).
     * Agregar constructor vacío y con parámetros así como setters y getters.
     * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
     * a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
     * capacidad máxima. b) Método servirTaza(int): se pide el tamaño de una
     * taza vacía, el método recibe el tamaño de la taza y simula la acción de
     * servir la taza con la capacidad indicada. Si la cantidad actual de café
     * “no alcanza” para llenar la taza, se sirve lo que quede. El método le
     * informará al usuario si se llenó o no la taza, y de no haberse llenado en
     * cuanto quedó la taza. c) Método vaciarCafetera(): pone la cantidad de
     * café actual en cero. d) Método agregarCafe(int): se le pide al usuario
     * una cantidad de café, el método lo recibe y se añade a la cafetera la
     * cantidad de café indicada.
     */
    public static void main(String[] args) {
        //Cafetera cafetera1 = new Cafetera();
       
        CafeteraServicio cs = new CafeteraServicio();
        
        Cafetera cafetera1 = cs.crearCafetera();
        
        cs.mostrarMenu(cafetera1);
          
    }
    
}
