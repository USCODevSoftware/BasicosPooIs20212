/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basicos;

/**
 *
 * @author Usuario
 */
public class Operadores {
    
    public static void main(String[] args) {
        // Comentario de línea
        System.out.println("Hola mundo con Java en POO IS-USCO");
        int varA=5;
        int varB=6;
        //Operadores arítmeticos binarios
        int suma=varA+varB;
        System.out.println("suma = " + suma);
        int resta=varA-varB;
        System.out.println("resta = " + resta);
        int producto=varA*varB;
        System.out.println("producto = " + producto);
        float division=(float)varA/(float)varB;
        System.out.println("division = " + division);
        int modulo=varA%varB;
        System.out.println("modulo = " + modulo);
        //Opeadores unarios
        varA=1;
        varB=1;
        varA++;//Es equivalente varA=varA+1;
        System.out.println("varA++ = " + varA);
        ++varB;
        System.out.println("++varB = " + varB);
        varA--;//Es equivalente varA = varA-1
        System.out.println("varA-- = " + varA);
        --varB;
        System.out.println("--varB = " + varB);
        varA = 2;
        int c = ++varA + 5;
        System.out.println("c = " + c);
        System.out.println("varA = " + varA);
        //Acumulador
        System.out.println("Operadores de asignación");
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        varA+=varB;//varA = varA + varB;
        System.out.println("varA = " + varA);
        varB=4;
        varA+=varB;//varA = varA + varB;
        System.out.println("varA = " + varA);
        
        //Operadores lógicos
        System.out.println("Operadores lógicos");
        boolean boolA, boolB, boolC;
        boolA = false;
        boolB = false;
        boolC = boolA || !boolB;
        System.out.println("boolC = " + boolC);
        
        //Operadores relacionales
        System.out.println("Operadores Relacionales");
        varA = 5;
        varB = 3;
        boolC = varA >= varB;
        System.out.println("boolC = " + boolC);
        
        
        
        
        

        
        
        
        
        
        
        
    }
    
}
