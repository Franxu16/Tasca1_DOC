import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Fran Vidal Chiclana
 *
 * Clase creada para albergar los test de JUnit de la clase HYPERPAR, que se utilizaran para comprobrar
 * mediante tests, en los que se utilizará la etiqueta AssertEquals que los métodos de la clase funcionan
 * correctamente y dan los resultados correspondientes con los parametros que se le introducen
 *
 */

public class HyperPar_Tests {
    /**
     * Test donde se comprueba que los números introducidos son una mezcla entre pares he impares
     *
     * Resultado: false
     */
    @Test
    void testNumeroHyperpar(){
        assertEquals(false, HyperPar.calcularHyperpar(95431));
    }

    /**
     * Test donde se comprueba que los numeros que se han introducidos son todos pares
     *
     * Resultado: true
     */
    @Test
    void testNumeroHyperpar2(){
        assertEquals(true, HyperPar.calcularHyperpar(2246));
    }

    /**
     * Test donde se comprueba que todos el número que está compuesto del 2 es par en su totalidad
     *
     * Resultado: true
     */
    @Test
    void testNumeroHyperpar3(){
        assertEquals(true, HyperPar.calcularHyperpar(2222));
    }

    /**
     * Test donde se comprueba que los componentes de 2 cifras son todos imparres
     *
     * Resultado: false
     */
    @Test
    void testNumeroHyperpar4(){
        assertEquals(false, HyperPar.calcularHyperpar(131517));
    }

    /**
     * Test donde se comprueba que pese a ser todos los numeros pares el último rompe el resultado
     *
     * Resultado: false
     */
    @Test
    void testNumeroHyperpar5(){
        assertEquals(false, HyperPar.calcularHyperpar(4445));
    }

    /**
     * Test donde se comprueba que la conjunción de números pares es un Hyperpar
     *
     * Resultado: true
     */
    @Test
    void testNumeroHyperpar6(){
        assertEquals(true, HyperPar.calcularHyperpar(24860));
    }

    /**
     * Test donde se comprueba que todas las cifras del número, que se compone de numeros 4 es par en su totalidad
     *
     * Resulado: true
     */
    @Test
    void testNumeroHyperpar7(){
        assertEquals(true, HyperPar.calcularHyperpar(444444));
    }

    /**
     * Test donde se comrueba que el número compuesto de números 6 es un hyperpar
     *
     * Reusltado: true
     */
    @Test
    void testNumeroHyperpar8(){
        assertEquals(true, HyperPar.calcularHyperpar(66666));
    }
}
