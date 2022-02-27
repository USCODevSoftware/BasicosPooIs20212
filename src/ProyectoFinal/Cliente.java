
package ProyectoFinal;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Cliente implements Serializable,Comparable{
    private int id;
    private String nombre;
    private String email;
    private String movil;
    private double montoMaximo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String email, String movil, double montoMaximo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.movil = movil;
        this.montoMaximo = montoMaximo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    @Override
    //public String toString() {
    //    return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", movil=" + movil + ", montoMaximo=" + montoMaximo + '}';
    //}
    public String toString() {
        return nombre;
    }
    @Override
    public int compareTo(Object o) {
        Cliente cliente = (Cliente) o;
        return this.getNombre().compareTo(cliente.getNombre());

    }
    
    
}
