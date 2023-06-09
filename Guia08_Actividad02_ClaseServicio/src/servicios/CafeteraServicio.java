
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner sc = new Scanner(System.in);
    int op;
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad máxima de la cafetera");
        int capacidadMaxima = sc.nextInt();
        System.out.println("Ingrese la cantidad actual de café que tiene la cafetera");
        int cantidadActual = sc.nextInt();
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera");
    }
    
    public void servirTaza(int tam, Cafetera cafetera){
        if(tam < cafetera.getCantidadActual()){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tam);
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("La taza no se llenó, se sirvieron " + cafetera.getCantidadActual() + " ml de café");
            cafetera.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }
    
    public void agregarCafe(int cantidad, Cafetera cafetera){
        if((cantidad + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima())){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La cantidad de café que desea agregar supera la capacidad máxima de la cafetera, por lo tanto se llenó completamente");
        } else {
            cafetera.setCantidadActual(cantidad + cafetera.getCantidadActual());
            System.out.println("Se agregaron " + cantidad + " ml a la cafetera, la cantidad actual de café en la cafetera es de " + cafetera.getCantidadActual() + " ml");
        }
    }
    
    public void consultarDatos(Cafetera cafetera){
        System.out.println(cafetera.toString());
    }
    
    public void mostrarMenu(Cafetera cafetera1){
        do {            
            System.out.println("Ingrese la opción deseada");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Consultar datos de la cafetera");
            System.out.println("6. Salir");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    llenarCafetera(cafetera1);
                    break;
                case 2:
                    System.out.println("Ingrese la capacidad de la taza en ml");
                    int capacidad = sc.nextInt();
                    servirTaza(capacidad, cafetera1);
                    break;
                case 3:
                    vaciarCafetera(cafetera1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de café a agregar");
                    int cantidad = sc.nextInt();
                    agregarCafe(cantidad, cafetera1);
                    break;
                case 5:
                    consultarDatos(cafetera1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
            }
            
        } while (op != 6);
    }
}   
