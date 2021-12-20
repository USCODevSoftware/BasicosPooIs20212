package ProyectoBicicletas;

public class Bicicleta {
    //Atributos de la clase Bicileta
    public int velocidadActual;
    public int platoActual;
    public int pinonActual;
    
    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    //Dobla el valor del atributo velocidadActal
    public void acelerar(){
        this.velocidadActual=this.velocidadActual*2;
    }
    //Reduce la velocidadActual a la mitad
    public void frenar(){
        this.velocidadActual=this.velocidadActual/2;
    }
    //Reemplazar el valor del atributo platoActual
    public void cambiarPlato(int plato) {
        if ((plato >= 24) && (plato <= 42)) {
            this.platoActual = plato;
        } else {
            System.out.println("Valor de Plato no valido");
        }
    }
    //Reemplazar el valor del atributo pinonActual
    public void cambiarPinon(int pinon) {
        if ((pinon >= 11) && (pinon <= 36)) {
            this.pinonActual = pinon;
        } else {
            System.out.println("Valor de Piñon no valido");
        }
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }
    
}
    
    
 