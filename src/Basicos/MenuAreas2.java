/*
 Hacer un programa que le brinde al usuario la posibilidad 
de calcular el área de las siguiente figuras geométricas: 
círculo, rectángulo, triángulo y trapecio.
Menu Areas
1. Círculo
2. Rectángulo
3. Tríangulo
4. Trapecio
5. Salir
Seleccione la opción: 

Usa while para controlar el menu
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuAreas2 {
    public static void main(String[] args) {
        int opcion=0;
        Scanner s = new Scanner (System.in);
        while (opcion != 5) {
            System.out.println("Menú Areas");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Tríangulo");
            System.out.println("4. Trapecio");
            System.out.println("5. Salir");
            System.out.print("Seleccione la opción:");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Area del Círculo");
                    System.out.println("Ingrese el radio:");
                    int radio = s.nextInt();
                    double area = Math.PI * Math.pow(radio, 2);
                    System.out.println("Area = " + area);
                    break;
                case 2:
                    System.out.println("Area del Rectángulo");
                    System.out.println("Ingrese el lado 1:");
                    int lado1 = s.nextInt();
                    System.out.println("Ingrese el lado 2:");
                    int lado2 = s.nextInt();
                    area = lado1 * lado2;
                    System.out.println("Area = " + area);
                    break;

                case 3:
                    System.out.println("Area del Triángulo");
                    break;
                case 4:
                    System.out.println("Area del Trapecio");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción equivocada");

            }
        }
    }
        
    
}
