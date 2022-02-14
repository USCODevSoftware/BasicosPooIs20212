/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Archivos3 {

    public static void main(String[] args) {
        File f = new File("d:/Cursos/datos/salida.txt");
        //int x = 105;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
