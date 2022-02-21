/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import ArchivosDatos.Persona;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ClienteCRUD {
    private String archivo="C:/datos/clientes.dat";

    public ClienteCRUD(String archivo) {
        this.archivo = archivo;
    }

    public ClienteCRUD() {
    }
    
    public void agregarCliente(Cliente cliente) {
        try
        {
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(archivo,true));
            oos.writeUnshared(cliente);
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
      

    }

    public void eliminarCliente(Cliente cliente) {

    }

    public void actualizarCliente(Cliente cliente) {

    }

    public void leerCliente(float idCliente) {

    }
//Método que lee todos los objetos de Cliente guardado 
//en el archivo de datos y los coloca en una colección List
    public List listarClientes() {
        Object cliente = null;
        ArrayList<Cliente> list = new ArrayList();
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivo));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Cliente){
                    System.out.println(aux);
                    
                    list.add((Cliente) aux);
                }
                aux = ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin del archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return list;
    }

    

    
}
