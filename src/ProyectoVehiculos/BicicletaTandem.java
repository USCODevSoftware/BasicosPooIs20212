package ProyectoVehiculos;

public class BicicletaTandem extends Bicicleta {
    private int numAsientos;

    public BicicletaTandem(int numAsientos, int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual, platoActual, pinonActual);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "BicicletaTandem{" + "numAsientos=" + numAsientos + " "+super.toString()+'}';
    }
    
    @Override
    public void imprimir(){
        System.out.println("Método imprimir() en BicicletaTandem...");
    }
    
    
    
    
}
