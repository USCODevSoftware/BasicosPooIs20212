package ProyectoVehiculos;

public abstract class Vehiculo {
    private int velocidadActual;

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Vehiculo() {
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public abstract void acelerar();
    
    public abstract void frenar();
    
}
