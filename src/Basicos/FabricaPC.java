/*
En una fábrica de computadoras se planea ofrecer a los 
clientes un descuento que dependerá del número de 
computadoras que compre. Si las computadoras son menos 
de cinco se les dará un 10% de descuento sobre el total 
de la compra; si el número de computadoras es mayor o igual 
a cinco pero menos de diez se le otorga un 20% de descuento;
y si son 10 o más se les da un 40% de descuento. 
El precio de cada computadora es de U$500
*/
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Carlos Pedraza
 */
public class FabricaPC {
    public static void main(String[] args) {
        System.out.println("Cuantas computadoras desea comprar?");
        int cant=0;
        double totalVenta, descuento, totalAPagar;
        Scanner input = new Scanner(System.in);
        cant = input.nextInt();
        if (cant<5)
        {
            totalVenta=cant*500;
            descuento=totalVenta*0.1;
            totalAPagar = totalVenta - descuento;
        } else {
            if (cant < 10) {
                totalVenta = cant * 500;
                descuento = totalVenta * 0.2;
                totalAPagar = totalVenta - descuento;
            } else {
                totalVenta = cant * 500;
                descuento = totalVenta * 0.4;
                totalAPagar = totalVenta - descuento;
            }
        }
        System.out.println("Cantidad computadoras: " + cant);
        System.out.println("Total Venta: " + totalVenta);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a Pagar: " + totalAPagar);
        
    }
    
}
