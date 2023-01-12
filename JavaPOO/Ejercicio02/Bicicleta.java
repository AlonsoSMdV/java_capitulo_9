package JavaPOO.Ejercicio02;

public class Bicicleta extends Vehiculo {
    private int pinones; // nº de piñones
    public Bicicleta(int p) {
        super();
        this.pinones = p;
    }
    public void hazCaballito() {
        System.out.println("Estoy haciendo el caballito");
    }
}