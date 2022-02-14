package ProyectoVehiculos;

public class Bicicleta extends Vehiculo implements Imprimible {
    //Atributos de la clase Bicileta
    //private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    
    //Constructor

    public Bicicleta(int platoActual, int pinonActual, int velocidadActual) {
        super(velocidadActual);
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    
    //Constructor por defecto
    public Bicicleta() {
        //velocidadActual = 0;
        super(0);
        platoActual = 1;
        pinonActual = 1;
    }

    //Métodos get()
    
    public int getPlatoActual() {
        return platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    //Métodos set()
    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }

    //Dobla el valor del atributo velocidadActal
    public void acelerar() {
        int velocidad=getVelocidadActual();
        velocidad=velocidad*2;
        setVelocidadActual(velocidad);
    }

    //Reduce la velocidadActual a la mitad
    public void frenar() {
        //this.velocidadActual = this.velocidadActual / 2;
        setVelocidadActual(getVelocidadActual()/2);
    }
    
    public void frenar(int factor) {
        try {
            setVelocidadActual(getVelocidadActual()/factor);
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("Error:"+e.toString());
        }
        
    }

    //Reemplazar el valor del atributo platoActual
    public void cambiarPlato(int plato) {
        if ((plato >= 24) && (plato <= 42)) {
            this.platoActual = plato;
        } else {
            System.out.println("Valor de Plato no valido");
        }
    }

    //Método sobrecargado
    public void cambiarPlato() {
        this.platoActual = 1;
    }

    //Reemplazar el valor del atributo pinonActual
    public void cambiarPinon(int pinon) {
        if ((pinon >= 11) && (pinon <= 36)) {
            this.pinonActual = pinon;
        } else {
            System.out.println("Valor de Piñon no valido");
        }
    }

    //Método sobrecargado
    public void cambiarPinon() {
        this.pinonActual = 1;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + getVelocidadActual() + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Bicicleta");
        System.out.println("VelocidadActual:"+getVelocidadActual());
        System.out.println("Plato Actual:"+platoActual);
        System.out.println("Piñon Actual:" + pinonActual);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
