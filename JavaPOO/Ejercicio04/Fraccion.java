package JavaPOO.Ejercicio04;

public class Fraccion {
    private int signo;
    private int numerador;
    private int denominador;
    public Fraccion(int n, int d) {
        if (d == 0) {
            System.out.println("Una fracción no puede tener como denominador el número 0");
        } else {
            if (n * d < 0) {
                this.signo = -1;
            } else {
                this.signo = 1;
            }
                this.numerador = Math.abs(n);
                this.denominador = Math.abs(d);
        }
    }
    int getNumerador(){
        return this.numerador;
    }
    int getDenominador(){
        return this.denominador;
    }
    public String toString() {
        if (signo == -1) {
            return "-" + this.numerador + "/" + this.denominador;
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }
    /**
    * Devuelve una fracción invertida. Lo que antes era el numerador
    * ahora será el denominador y viceversa.
    */
    public Fraccion invierte() {
        return new Fraccion(this.signo * this.denominador, this.numerador);
    }
    /**
    * Devuelve una fracción multiplicada por un escalar (un número)
    */
    public Fraccion multiplica(int n) {
        return new Fraccion(this.signo * this.numerador * n, this.denominador);
    }
    /**
    * Devuelve una fracción que es el resultado de multiplicar la
    * fracción original por otra fracción que se pasa como parámetro.
    */
    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
    }
    /**
    * Devuelve una fracción dividida entre un escalar (un número) 
    */
    public Fraccion divide(int n) {
        return new Fraccion(this.signo * this.numerador, this.denominador * n);
    }
    /**
    * Devuelve una fracción que es el resultado de dividir la fracción
    * original entre otra fracción que se pasa como parámetro.
    */
    public Fraccion divide(Fraccion f) {
        return new Fraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
    }
    /**
    * Devuelve una fracción que es el resultado de simplificar la
    * fracción original.
    */
    public Fraccion simplifica() {
        int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;
        for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
            while (((n % i) == 0) && ((d % i) == 0)) {
                n /= i;
                d /= i;
            }
        }
        return new Fraccion(s * n, d);
    }
}