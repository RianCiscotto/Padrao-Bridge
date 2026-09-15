package padroesestruturais.bridge;

public class Militar extends Carreira {

    private int numOperacoes;

    public Militar(float salarioBase) {
        super(salarioBase);
    }

    public void setNumOperacoes(int numOperacoes) {
        this.numOperacoes = numOperacoes;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numOperacoes
                * (1 + this.patente.percentualAumento());
    }

}