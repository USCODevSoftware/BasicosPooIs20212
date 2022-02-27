
package ProyectoFinal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ClienteCRUD cCrud = new ClienteCRUD();
        //Cliente c = new Cliente(87987, "Mario Moreno","mario@mail.com","321900000",1123000);
        //cCrud.agregarCliente(c);
        //Cliente c2 = new Cliente(4321, "Paola Muñoz","paom34@hotmail.com","3047655555",2345621);
        //cCrud.agregarCliente(c2);
        

        //
        List<Object> listClientes = cCrud.listarClientes();
        for (int x = 0; x < listClientes.size(); x++) {
            System.out.println(listClientes.get(x).toString());
        }
        //Buscar un cliente
        try {
            Cliente clres = cCrud.leerCliente(456);
            System.out.println(clres.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public List listarClientes() {
        //Object cliente = null;
        String archivoU="C:/datos/clientesU.dat";
        ArrayList<Cliente> list = new ArrayList();
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivoU));
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
