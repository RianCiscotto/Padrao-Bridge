package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitarTest {

    @Test
    void deveRetornarSalarioMilitarComSoldado() {
        Patente patente = new Soldado();

        Militar militar = new Militar(1000.0f);
        militar.setPatente(patente);
        militar.setNumOperacoes(2);

        assertEquals(2000.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarComCabo() {
        Patente patente = new Cabo();

        Militar militar = new Militar(1000.0f);
        militar.setPatente(patente);
        militar.setNumOperacoes(2);

        assertEquals(2200.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarComSargento() {
        Patente patente = new Sargento();

        Militar militar = new Militar(1000.0f);
        militar.setPatente(patente);
        militar.setNumOperacoes(2);

        assertEquals(2400.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarComTenente() {
        Patente patente = new Tenente();

        Militar militar = new Militar(1000.0f);
        militar.setPatente(patente);
        militar.setNumOperacoes(2);

        assertEquals(2600.0f, militar.calcularSalario(), 0.01f);
    }

}