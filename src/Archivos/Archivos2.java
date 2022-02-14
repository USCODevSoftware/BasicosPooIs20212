/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Archivos2 {

    public static void main(String[] args) {
        File f = new File("d:/Cursos/datos/salida.txt");
        try {
            FileWriter fw = new FileWriter(f);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto = " ";
            while (texto.length() > 0) {
                texto = br.readLine();
                fw.write(texto + "\r\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
}
