
package ProyectoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cliente c = new Cliente(12345, "María","maria@mail.com","321345678",1000000);
        ClienteCRUD cCRUD = new ClienteCRUD();
        cCRUD.agregarCliente(c);
        Cliente c2 = new Cliente(5436, "Pedro","pedro@hotmail.com","+12345678",2000000);
        cCRUD.agregarCliente(c2);
        //escribeCliente0("C:/datos/clientes.dat");

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
