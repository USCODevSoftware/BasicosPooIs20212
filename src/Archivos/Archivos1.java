/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Archivos1 {

    public static void main(String[] args) {
        File f = new File("d:/Cursos/datos/prueba.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            int x = 0;
            while (x != -1) {
                x = fis.read();
                System.out.print((char) x);
            }
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo");  
            //e.printStackTrace();
        }

    }
    
    
}
