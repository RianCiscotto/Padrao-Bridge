package padroesestruturais.bridge;

public abstract class Carreira {

    protected Patente patente;

    protected float salarioBase;

    public Carreira(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}