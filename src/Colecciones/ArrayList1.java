/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Hola");
        a.add("Adiós");
        a.add("Hasta luego");
        a.add(0, "Buenos días");
        for (Object o : a) {
            System.out.println(o);
        }
        System.out.println("===============");
        a.add(0, "Hasta nunca");
        a.add("Hasta siempre");
        for (Object o : a) {
            //int i=a.
            System.out.println(o);
        }

    }
}

