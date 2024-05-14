/**
 * @author Fran Vidal Chiclana
 *
 * Práctica hecha para comprobar que un numero es HyperPar.
 * Un número HyperPar es un número que tiene todas sus cifras pares
 */

public class HyperPar {
    /**
     * Método hecho para comprobar que el número que se introduce es hyperpar
     *
     * @param N         Parametro de entrada del método calcularHyper
     */
    public static boolean calcularHyperpar(long N) {
        boolean esHP = esHyperPar(N);
        if (esHP) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que hace el cálculo de los números hyperpares.
     * Se le pasa un parametro de entrada que es el que se utiliza como cifra de calculo
     *
     * @param entrada                   Número introducido por el usuario para comprobar si es hyperpar
     * @return                          Método que devuelve la variable Long haciendo una división entre 10 que
     *                                  sirve como resultado del método, que es una línea boolean
     */
    public static boolean esHyperPar(long entrada) {
        for (long num = entrada; num > 0; num /= 10) {
            if ((num % 10) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
