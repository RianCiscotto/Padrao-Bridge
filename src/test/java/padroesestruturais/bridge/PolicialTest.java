package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolicialTest {

    @Test
    void deveRetornarSalarioPolicialComSoldado() {
        Patente patente = new Soldado();
        Policial policial = new Policial(2000.0f);
        policial.setPatente(patente);

        assertEquals(2000.0f, policial.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPolicialComCabo() {
        Patente patente = new Cabo();
        Policial policial = new Policial(2000.0f);
        policial.setPatente(patente);

        assertEquals(2200.0f, policial.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPolicialComSargento() {
        Patente patente = new Sargento();
        Policial policial = new Policial(2000.0f);
        policial.setPatente(patente);

        assertEquals(2400.0f, policial.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPolicialComTenente() {
        Patente patente = new Tenente();
        Policial policial = new Policial(2000.0f);
        policial.setPatente(patente);

        assertEquals(2600.0f, policial.calcularSalario(), 0.01f);
    }

}