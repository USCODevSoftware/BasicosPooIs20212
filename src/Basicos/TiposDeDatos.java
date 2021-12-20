/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basicos;

/**
 *
 * @author Usuario
 */
public class TiposDeDatos {
    
    public static void main(String[] args) {
        final double FINAL=3.1416;
        byte valorByte=10;
        //Cada tipo primitivo tiene en Java una clase asociada
        //Para el tipo byte, existe una clase Byte
        System.out.println("Valor Máximo:"+Byte.MAX_VALUE);
        System.out.println("Valor Mínimo:"+Byte.MIN_VALUE);
        
        //Clase Short: short
        short valorShort = (short)1000000;
        
        System.out.println("valorShort = " + valorShort);
        System.out.println("Valor Máximo:"+Short.MAX_VALUE);
        System.out.println("Valor Mínimo:"+Short.MIN_VALUE);
        
        //Reales: float, double
        
        float valorFloat = 10.0F;
        double valorDouble = 10.0;
        
        //Booleans
        
        boolean valorBoolean1=true;
        boolean valorBoolean2=false;
        
        //Alfanuméricos
        
        char valorChar='A';
        System.out.println("valorChar = " + valorChar);
        String valorString="Cadena";
        System.out.println("valorString = " + valorString);
        
        
        
        
        
    }
    
}
