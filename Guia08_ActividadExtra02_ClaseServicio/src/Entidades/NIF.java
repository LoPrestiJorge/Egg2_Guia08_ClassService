/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra ՄNIFՅ. Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde.
 */
package Entidades;

public class NIF {
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
}
