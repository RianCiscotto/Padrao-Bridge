package padroesestruturais.bridge;

public class Policial extends Carreira {

    public Policial(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }

}