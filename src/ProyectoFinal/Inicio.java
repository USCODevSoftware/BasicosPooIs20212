/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Usuario
 */
//Clase para iniciar el archivo de datos y agregar registros
public class Inicio {
     public static void main(String[] args) {
        escribeCliente0("C:/datos/clientes.dat");
        ClienteCRUD cCRUD = new ClienteCRUD();
        Cliente c = new Cliente(12345, "María","maria@mail.com","321345678",1000000);
        cCRUD.agregarCliente(c);
        Cliente c2 = new Cliente(5436, "Pedro","pedro@hotmail.com","+12345678",2000000);
        cCRUD.agregarCliente(c2);
        Cliente c3 = new Cliente(6789, "Diana","diana1@gmail.com","3134523212",3450000);
        cCRUD.agregarCliente(c3);
        Cliente c4 = new Cliente(5436, "Juan","juan@outlook.com","3109875432",1550000);
        cCRUD.agregarCliente(c4);
        Cliente c5 = new Cliente(87987, "Mario Moreno","mario@mail.com","321900000",1123000);
        cCRUD.agregarCliente(c5);
        Cliente c6 = new Cliente(4321, "Paola Muñoz","paom34@hotmail.com","3047655555",2345621);
        cCRUD.agregarCliente(c6);

        //
        List<Object> listClientes = cCRUD.listarClientes();
        for (int x = 0; x < listClientes.size(); x++) {
            System.out.println(listClientes.get(x).getClass());
        }
    }
    public static void escribeCliente0(String fichero)
    {
        Cliente c = new Cliente(0, "","","",0);
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(fichero));
            oos.writeObject(c);
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
