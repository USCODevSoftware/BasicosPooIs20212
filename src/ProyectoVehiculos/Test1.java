/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVehiculos;

/**
 *
 * @author Usuario
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Prueba de la clase BicicletaMontana");
        BicicletaMontana miBM=new BicicletaMontana(5,10,24,36);
        System.out.println("BM: "+miBM.toString());
        miBM.acelerar();
        System.out.println("Despúes de Acelerar...");
        System.out.println("BM: "+miBM.toString());
        miBM.frenar();
        System.out.println("Despúes de Frenar...");
        System.out.println("BM: "+miBM.toString());
       
        
    }
}
