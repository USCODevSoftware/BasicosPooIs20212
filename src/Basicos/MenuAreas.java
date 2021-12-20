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

 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuAreas {
    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner (System.in);
        System.out.println("Menú Areas");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Tríangulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.print("Seleccione la opción:"); 
        opcion=s.nextInt();
        /*
        if (opcion==1)
        {
            //Instrucciones para el area del círculo
        }
        else
        {
            if (opcion==2)
            {
                //Instrucciones para el area del rectángulo
            }
            else
            {
                if (opcion==3)
                {
                    //Instrucciones para el area del triángulo
                }
                else
                {
                    if (opcion==4)
                    {
                        //Instrucciones para el area del trapecio
                    }
                    else
                    {
                        if (opcion == 5)
                        {
                            System.out.println("Salir");
                        }
                        else
                        {
                            System.out.println("Opción no valida");
                        }
                    }
                }
            }
        }*/
        //Condicional múltiples
        switch (opcion)
        {
            case 1:
                System.out.println("Area del Círculo");
                System.out.println("Ingrese el radio:");
                int radio =s.nextInt();
                double area=Math.PI*Math.pow(radio,2);
                System.out.println("Area = "+ area);
                break;
            case 2:
                System.out.println("Area del Rectángulo");
                System.out.println("Ingrese el lado 1:");
                int lado1=s.nextInt();
                System.out.println("Ingrese el lado 2:");
                int lado2=s.nextInt();
                area=lado1*lado2;
                System.out.println("Area = "+ area);
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
