
package ProyectoCuentas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario
 */
public class ClienteCRUD {
    private String archivo="d:/Cursos/datosCuentas/clientes1.dat";

    public ClienteCRUD(String archivo) {
        this.archivo = archivo;
    }

    public ClienteCRUD() {
    }
    
    public void agregarCliente(Cliente cliente) {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(archivo));
            oos.writeObject(cliente);
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

    public void listarClientes() {

    }

    
}
