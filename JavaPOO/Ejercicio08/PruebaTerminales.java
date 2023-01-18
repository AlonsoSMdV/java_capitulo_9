package JavaPOO.Ejercicio08;

public class PruebaTerminales {
    public static void main(String[] args) {
        Terminal t1 = new Terminal("699 44 52 93");
        Terminal t2 = new Terminal("647 26 76 69");
        Terminal t3 = new Terminal("662 29 46 10");
        Terminal t4 = new Terminal("663 85 88 58");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 490);
        t1.llama(t3, 120);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}