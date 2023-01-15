package JavaPOO.Ejercicio03;

public class PruebaAnimales {
    public static void main(String[] args) {
        Pinguino tux = new Pinguino(Sexo.MACHO);
        tux.come("palomitas");
        tux.programa();
        tux.vuela();
        tux.nada();
        Canario pio = new Canario(Sexo.MACHO);
        pio.ponHuevo();
        pio.vuela();
        pio.canta();
        pio.caza();
        pio.limpiate();
        Perro laika = new Perro(Sexo.HEMBRA);
        laika.duerme();
        laika.dameLaPata();
        laika.amamanta();
        laika.cuidaCrias();
        Lagarto godzilla = new Lagarto(Sexo.MACHO);
        godzilla.tomaElSol();
        godzilla.duerme();
        Gato Silvestre = new Gato(Sexo.MACHO);
        Gato Garfield = new Gato(Sexo.MACHO);
        Silvestre.ronronea();
        Silvestre.come("pescado");
        Silvestre.peleaCon(Garfield);
    }
}
