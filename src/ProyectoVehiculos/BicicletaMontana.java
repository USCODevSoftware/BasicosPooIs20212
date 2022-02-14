package ProyectoVehiculos;

public class BicicletaMontana extends Bicicleta {

    private int suspension;

    public BicicletaMontana(int suspension, int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual, platoActual, pinonActual);
        this.suspension = suspension;
    }
    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }
    
    public void cambiarSuspension(int suspension){
        this.suspension = suspension;
    }
    
    //Dobla el valor del atributo velocidadActal
    public void acelerar() {
        int velocidadActual=super.getVelocidadActual();
        velocidadActual = velocidadActual * 3;
        super.setVelocidadActual(velocidadActual);
    }

    @Override
    public String toString() {
        return "BicicletaMontana{" + "suspension=" + suspension + " "+ super.toString()+ '}';
    }
    
    

}
