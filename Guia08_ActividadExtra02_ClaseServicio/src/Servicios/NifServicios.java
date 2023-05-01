/*
En NIFService
se dispondrá de los siguientes métodos:
a) Métodos getters y setters para el número de DNI y la letra.
b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469՞FՅ.
La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22. El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:

POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;
import java.util.Vector;

public class NifServicios {
    private static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    NIF usuario = new NIF();
//a) Métodos getters y setters para el número de DNI y
//la letra.
public void modificarDNI(NIF nif){
          System.out.println("Ingrese el nuevo dni");
          nif.setDni(entrada.nextLong());
      }
      
      public char consultarLetra(NIF nif){
          return nif.getLetra();
      }
      
       public long consultarDNI(NIF nif){
          return nif.getDni();
      }
//b) Método crearNif(): le pide al usuario el DNI y con ese DNI
//* calcula la letra que le corresponderá. Una vez calculado, le asigna la
//* letra que le corresponde.
    
    /*
    public NIF crearValores(NIF usuario){
        System.out.println("Ingrese el DNI: ");
        usuario.setDni(entrada.nextLong());
        String letra = calcularLetra(usuario.getDni());
        usuario.setLetra(letra);
        
        return usuario;
    }
    */

      public NIF crearNif(){
           System.out.println("Ingrese el DNI");
           long dni = entrada.nextLong();
           
           char letra = calcularLetra(dni);
           
           return new NIF(dni, letra);
       }
    
    //Se agrega [] porque va a devolver un arreglo. Acordate que, en el return, tiene que devolver 
    //el mismo tipo.
    public char calcularLetra(long dni){
        
        /* Esto es una forma pero hay otra mas eficiente:
        String [] arreglo = new String[22];
        arreglo[0] = "T";
        arreglo[1] = "R"; 
        etc....
        */
        //La otra forma más optima es así:  
        char [] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int posicion = (int)dni % vector.length; //usa '(int)' para no entrar en conflicto con los tipos
                                                  //porque devuelve un mismo tipo: entero)
        return vector[posicion];
    }  
    
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469-f.
public void mostrar(NIF nif){
           System.out.println("NIF: " + consultarDNI(nif) + "-" + consultarLetra(nif));
       }
}
