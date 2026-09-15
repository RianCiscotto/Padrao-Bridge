package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombeiroTest {

    @Test
    void deveRetornarSalarioBombeiroComSoldado() {
        Patente patente = new Soldado();
        Bombeiro bombeiro = new Bombeiro(2500.0f);
        bombeiro.setPatente(patente);

        assertEquals(2500.0f, bombeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBombeiroComCabo() {
        Patente patente = new Cabo();
        Bombeiro bombeiro = new Bombeiro(2500.0f);
        bombeiro.setPatente(patente);

        assertEquals(2750.0f, bombeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBombeiroComSargento() {
        Patente patente = new Sargento();
        Bombeiro bombeiro = new Bombeiro(2500.0f);
        bombeiro.setPatente(patente);

        assertEquals(3000.0f, bombeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBombeiroComTenente() {
        Patente patente = new Tenente();
        Bombeiro bombeiro = new Bombeiro(2500.0f);
        bombeiro.setPatente(patente);

        assertEquals(3250.0f, bombeiro.calcularSalario(), 0.01f);
    }

}