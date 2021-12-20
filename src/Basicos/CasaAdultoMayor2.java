/*
La casa del adulto mayor tiene 37 personas registradas y 
requiere un reporte de los adultos con más de 85 años. 
Para ello implementa un sistema en el que se capturan el 
nombre y la edad de cada persona e imprime los datos de 
quienes cumplen con la condición solicitada.
Al finalizar debe mostrar el % de personas que cumplen con 
el criterio
//Con el uso de for
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Carlos Pedraza
 */
public class CasaAdultoMayor2 {
    public static void main(String[] args) {
        int edad, numeroAdulto=1, cantMayor=0;
        String nombre;
        //System.out.println("Hola mundo con Java en POO IS-USCO");
        Scanner s = new Scanner(System.in);
        for(numeroAdulto=1;numeroAdulto<=5;numeroAdulto++)
        {
            System.out.print("Ingrese el nombre: ");
            nombre = s.nextLine();
            System.out.print("Ingrese la edad: ");
            edad = s.nextInt();
            if (edad>85)
            {
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                cantMayor++;
            }
            
        }
        double porcentaje=((double)cantMayor/((double)numeroAdulto-1));
        System.out.println("% Adultos mayores de 85 años:" + porcentaje);
        
        
    }
    
}
