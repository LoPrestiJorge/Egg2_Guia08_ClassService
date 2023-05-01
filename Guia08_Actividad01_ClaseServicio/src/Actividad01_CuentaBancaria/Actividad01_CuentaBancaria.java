/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.

 */
package Actividad01_CuentaBancaria;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Actividad01_CuentaBancaria {

    public static void main(String[] args) {
        //Siempre tenes que instanciar la clase servicio en el main.
        CuentaBancariaServicio usuario = new CuentaBancariaServicio();
        
        Scanner entrada = new Scanner(System.in);
        int op; 
        int contador = 0;
        long dni; 
        
   //usamos un array para crear un determinado número de cuentas (esto no forma parte de la consigna).
        System.out.println("¿Cuantas cuentas bancarias querés crear?");
        int cantidad = entrada.nextInt();
        CuentaBancaria[] banco = new CuentaBancaria[cantidad]; 
        
        do {
            System.out.println("Ingrese la opción deseada: ");
            System.out.println("1. Crear una nueva cuenta bancaria");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Extración rápida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar cuenta bancaria");
            System.out.println("7. Salir");
            
            op = entrada.nextInt();
            
            switch  (op){
                case 1:
                    if (contador < banco.length) {
                        banco[contador] = usuario.crearCuenta();
                        contador++;
                    } else {
                        System.out.println("Se alcanzó el límite de cuentas");
                    }
                    break;
                
                case 2:
                    System.out.println("Ingrese el dni de la cuenta: ");
                    dni = entrada.nextLong();
                    for(int i = 0; i < banco.length; i++) {
                        if(usuario.consultarDni(banco[i]) == dni){
                            System.out.println("Cuando dinero desea ingresar: ");
                            double dinero = entrada.nextDouble();
                            usuario.ingresarSueldo(dinero, banco[i]);
                        }  
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el dni de la cuenta: ");
                    dni = entrada.nextLong();
                    for(int i = 0; i < banco.length; i++) {
                        if(usuario.consultarDni(banco[i]) == dni){
                            System.out.println("Cuando dinero desea retirar: ");
                            double dinero = entrada.nextDouble();
                            usuario.retirarDinero(dinero, banco[i]);
                        }  
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el dni de la cuenta: ");
                    dni = entrada.nextLong();
                    for (int i = 0; i < banco.length; i++) {
                        if (usuario.consultarDni(banco[i]) == dni) {
                            System.out.println("Cuando dinero desea retirar: ");
                            double dinero = entrada.nextDouble();
                            usuario.extraccionRapida(dinero, banco[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Ingrese el dni de la cuenta: ");
                    dni = entrada.nextLong();
                    for (int i = 0; i < banco.length; i++) {
                        if (usuario.consultarDni(banco[i]) == dni) {
                            usuario.consultarSaldo(banco[i]);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Ingrese el dni de la cuenta: ");
                    dni = entrada.nextLong();
                    for (int i = 0; i < banco.length; i++) {
                        if (usuario.consultarDni(banco[i])== dni){
                            usuario.consultarDatos(banco[i]);
                        }                       
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;
                default: 
                    System.out.println("Ingresaste una opción incorrecta.");
                    break;
            }
        } while (op !=7);
    }   
}
