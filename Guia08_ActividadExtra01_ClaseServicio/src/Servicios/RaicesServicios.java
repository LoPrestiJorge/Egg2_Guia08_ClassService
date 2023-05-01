/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {
    private static Scanner entrada = new Scanner(System.in);

//método asignar valores
    public Raices asignarValores (){
        Raices valor = new Raices();
        System.out.println("ingrese un valor numérico para coeficiente a: ");
        valor.setA(entrada.nextDouble());
        System.out.println("ingrese un valor numérico para coeficiente b: ");
        valor.setB(entrada.nextDouble());
        System.out.println("ingrese un valor numérico para coeficiente c: ");
        valor.setC(entrada.nextDouble());
        return valor; 
    }
   
//a) Método getDiscriminante(): devuelve el valor del discriminante
//(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c   
    public static double getDiscriminante(Raices valor){
        double d = 0; //valor del discriminante
        d = (Math.pow(valor.getB(),2)) - (4*valor.getA()*valor.getC());
        return d;
    }

//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0.    
    public static boolean tieneRaices(Raices valor){
        return getDiscriminante(valor) >= 0;
    }  
//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.
        public static boolean tieneRaiz(Raices valor){
        return getDiscriminante(valor) == 0;
       }
   
//d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
//imprime las 2 posibles soluciones.
        public static void obtenerRaices(Raices valor) {
        if (tieneRaices(valor)) {
            double discriminante = Math.sqrt(getDiscriminante(valor));
            double raiz1 = (-valor.getB() + discriminante) / (2 * valor.getA());
            double raiz2 = (-valor.getB() - discriminante / 2 * valor.getA());
            //se sigue la fórmula (-b±√((b^2)՞Մ4*a*c)))/(2*a) pero solamente usamos la primera parte
            //-b (discriminante) / (2*a-) porque el discriminante ya lo calculamos en otra función. 

            System.out.println("El resultado de la raiz 1 es: " + raiz1);
            System.out.println("El resultado de la raiz 2 es: " + raiz2);
        }
    }
//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.
        public static void obtenerRaiz(Raices valor) {
        //No va el discriminante aca porque su valor es 0, directamente va el if.
        if (tieneRaiz(valor)) {
            double raiz = (-valor.getB() / (2 * valor.getA()));
            System.out.println("El resultado de la raiz es: " + raiz);
        }
    }
//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.     
        public static void calcular(Raices valor) {
        if (tieneRaices(valor)) {            //invocas directamente la función o método.
            obtenerRaices(valor);
        } else if (tieneRaiz(valor)) {
            obtenerRaiz(valor);
        } else {
            System.out.println("No hay solución real para esta ecuación.");
        }
    }
}
