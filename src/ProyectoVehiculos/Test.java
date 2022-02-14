/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVehiculos;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Prueba de la clase Bicicleta");
        Bicicleta tuBicicleta=new Bicicleta(15,24,36);
        tuBicicleta.imprimir();
        Bicicleta miBicicleta=new Bicicleta(10,24,36);
        
        System.out.println(tuBicicleta.toString());
        //Acelerar
        System.out.println("Acelera...");
        tuBicicleta.acelerar();
        System.out.println(tuBicicleta.toString());
        //Frenar
        System.out.println("Frena...");
        tuBicicleta.frenar();
        System.out.println(tuBicicleta.toString());
        //Cambiar el piñon
        System.out.println("Cambiar el piñon...");
        tuBicicleta.cambiarPinon(24);
        System.out.println(tuBicicleta.toString());
        //Cambiar el plato
        System.out.println("Cambiar el plato...");
        tuBicicleta.cambiarPlato(42);
        tuBicicleta.cambiarPinon(24);
        tuBicicleta.acelerar();
        tuBicicleta.acelerar();
        System.out.println(tuBicicleta.toString());   
        //tuBicicleta.velocidadActual=17;
        //tuBicicleta.pinonActual=11;
        //tuBicicleta.platoActual=42;
        //System.out.println(tuBicicleta.toString()); 
        //Se llaman a los métodos sobrecargados
        tuBicicleta.cambiarPinon();
        tuBicicleta.cambiarPlato();
        System.out.println("Despues de usar los método sobrecargados"); 
        System.out.println(tuBicicleta.toString()); 
        //Uso del segundo constructor
        Bicicleta otraBicicleta=new Bicicleta();
        System.out.println("Uso del segundo constructor"); 
        System.out.println(otraBicicleta.toString());
        //Uso de los métodos set y get
        otraBicicleta.setVelocidadActual(25);
        System.out.println("Despues de usar el método set()"); 
        System.out.println(otraBicicleta.toString());
        otraBicicleta.acelerar();
        int v = otraBicicleta.getVelocidadActual();
        System.out.println("Velocidad actual de otraBicicleta:" + v);
        //Herencia
        BicicletaTandem miBT = new BicicletaTandem(2,10,24,36);
        System.out.println("BT:" + miBT.toString());
        miBT.imprimir();
        miBT.frenar(0);

        
    }
}
