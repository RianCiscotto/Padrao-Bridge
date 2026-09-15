package padroesestruturais.bridge;

public class Bombeiro extends Carreira {

    public Bombeiro(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }

}