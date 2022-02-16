
package ProyectoCuentas;

import java.io.Serializable;


public class Cliente implements Imprimible, Serializable {
    protected float idCliente;
    protected String nombre;
    protected String email;
    protected String movil;

    public Cliente(float idCliente, String nombre, String email, String movil) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.movil = movil;
    }

    public Cliente() {
    }
    
    

    public float getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(float idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public void imprimir() {
        System.out.println("Cliente");
        System.out.println("ID: "+ idCliente);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Email: "+ email);
        System.out.println("Celular: "+ movil);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
