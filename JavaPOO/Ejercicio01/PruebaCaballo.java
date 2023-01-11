package JavaPOO.Ejercicio01;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo a = new Caballo("Avra", "marrón moteado", 6, 24);
        Caballo l = new Caballo("Lykos", "negro", 8, 61);
        System.out.println("Hola, me llamo " + a.getNombre() + ", soy de color " + a.getColor() + ", tengo " + a.getEdad() + " y he ganado " + a.getCarrerasGanadas());
        a.cabalga();
        a.relincha();
        System.out.println("Hola, yo soy " + l.getNombre() + ", soy de color " + l.getColor() + ", tengo " + l.getEdad() + " y he ganado " + l.getCarrerasGanadas());
        l.rumia();
        l.cabalga();
    }
    }