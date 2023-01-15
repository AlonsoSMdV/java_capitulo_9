package JavaPOO.Ejercicio03;

public abstract class Animales {
    private Sexo sexo;
    public Animales () {
        this.sexo = Sexo.MACHO;
    }
    public Animales (Sexo s) {
        this.sexo = s;
    }
    public Sexo getSexo() {
        return this.sexo;
    }
    public void duerme() {
        System.out.println("Zzzzzzz");
    }
    public void come(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }
}
