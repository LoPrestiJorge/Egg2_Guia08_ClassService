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
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

//a) método para crear cuenta. Se nombra la clase "CuentaBancaria" seguido del nombre del método: 
//crearCuenta
public class CuentaBancariaServicio {
    private static Scanner entrada = new Scanner (System.in);
    
    public CuentaBancaria crearCuenta(){
        //Se instancia el objeto CuentaBancaria con sus atributos vacíos.
        CuentaBancaria usuario = new CuentaBancaria();
        System.out.println("Ingrese los datos para crear la cuenta: ");
        System.out.println("Ingrese el número de cuenta: ");
        usuario.setNumeroCuenta(entrada.nextInt());
        System.out.println("Ingrese el número su DNI: ");
        usuario.setDniCliente(entrada.nextInt());
        System.out.println("Ingrese su saldo actual: ");
        usuario.setSaldoActual(entrada.nextDouble()); 
        
        //Retorno el nacimiento de una nueva cuenta Bancaria que va a tener las caracteristicas
        //ingresada por el usuario.
        return usuario;           
    }  
   
 //b) Método para ingresar dinero y sumarlo con el sueldo actual
    public void ingresarSueldo(double dinero, CuentaBancaria usuario){
        usuario.setSaldoActual(usuario.getSaldoActual()+dinero); //Así se suma invocando desde una
                                                                 //clase atributo.
    }
 
//c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
//restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
//retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirarDinero(double dinero, CuentaBancaria usuario){
        if(usuario.getSaldoActual()> dinero){
            usuario.setSaldoActual(usuario.getSaldoActual()- dinero);
        }else 
            usuario.setSaldoActual(0);
    }

//d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
//Validar que el usuario no saque más del 20%.  
    public void extraccionRapida(double dinero, CuentaBancaria usuario){
        if (usuario.getSaldoActual()*0.2 >= dinero){
            usuario.setSaldoActual(usuario.getSaldoActual()-dinero);
        }else{
            System.out.println("No se puede retirar más del 20%");
        }         
    }
    
 //e) Método consultarSaldo: permitirá consultar el saldo disponible en la
//cuenta.
    public void consultarSaldo(CuentaBancaria usuario){
        System.out.println("Su sualdo actual es: "+usuario.getSaldoActual()+"$");
    }
    
//Método extra para consultar el dni para el for del main
    public long consultarDni(CuentaBancaria usuario){
        return usuario.getDniCliente();
    }
    
//f) Método consultarDatos: permitirá mostrar todos los datos de la
//cuenta.
    public void consultarDatos(CuentaBancaria usuario){
        System.out.println(usuario.toString());
    }
}

        
     
        
    
        
    

