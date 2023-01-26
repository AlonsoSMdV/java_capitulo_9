package JavaPOO.Ejercicio15;

public class Domino {
    public static void main(String[] args) {
        int cuentaFichas = 0;
        FichaDomino[] fichas = new FichaDomino[8];
        fichas[0] = new FichaDomino();
        for (int i = 1; i < 8; i++) {
            FichaDomino aux;
        do {
            aux = new FichaDomino();
        } while (!fichas[i - 1].encajaEnFila(aux));
            fichas[i] = aux;
        }
        for (FichaDomino ficha : fichas) {
            System.out.print(ficha);
        }
    }
}
    