package ProyectoFinal;

import ArchivosDatos.Persona;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
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

    public void actualizarCliente(List listClientes) {
        int i=0;
        String archivoU="C:/datos/clientes.dat";
        System.out.println("Actualizando clientes...");
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivoU));
            Iterator<Cliente> iter = listClientes.iterator();
            Cliente cl = null;
            while (iter.hasNext()) {
                cl = iter.next();
                if (i==0)
                    salida.writeObject(cl);
                else
                    salida.writeUnshared(cl);
                i++;
                
            }
            salida.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
//Metodo que devuelve on objeto Cliente si existe alguno guardado
//en el archivo que coincida con idCliente. Retora un objeto null,
//si no encuentre concidencia    
    public Cliente leerCliente(float idCliente) {
        Cliente cliente = null;
        //Se obtiene la lista de clientes
        List<Cliente> listClientes  = listarClientes();
        for (Cliente cl : listClientes) {
            if (cl.getId() == idCliente) {
                cliente=cl;
                break;
            } 
        }
        return cliente;
    }
//Método que lee todos los objetos de Cliente guardado 
//en el archivo de datos y los coloca en una colección List
    public List listarClientes() {
        //Object cliente = null;
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
                    //System.out.println(aux);                    
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
