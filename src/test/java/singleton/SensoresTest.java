package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensoresTest {

    @Test
    public void deveRetornarNomeRede() {
        Sensores.getInstance().setNomeRede("Rede de Sensores 1");
        assertEquals("Rede de Sensores 1", Sensores.getInstance().getNomeRede());
    }

    @Test
    public void deveRetornarQuantidadeSensores() {
        Sensores.getInstance().setQuantidadeSensores(10);
        assertEquals(10, Sensores.getInstance().getQuantidadeSensores());
    }

    @Test
    public void deveLigarERetornarEstadoLigada() {
        Sensores.getInstance().ligar();
        assertTrue(Sensores.getInstance().isLigada());
    }

    @Test
    public void deveDesligarERetornarEstadoDesligada() {
        Sensores.getInstance().ligar(); // Ligar para poder desligar
        Sensores.getInstance().desligar();
        assertFalse(Sensores.getInstance().isLigada());
    }

}
