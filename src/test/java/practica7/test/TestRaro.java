package practica7.test;

import java.util.Scanner;
import java.util.Random;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Rule;
import org.junit.rules.Timeout;

import practica7.enums.*;
import practica7.app.*;
import practica7.exep.*;


public class TestRaro {

    /** Expiración para que ninguna prueba tarde más de 5 segundos. */
    @Rule 
    public Timeout expiracion = Timeout.seconds(5);

    private static Random rnd = new Random();
    private Scanner in = new Scanner(System.in);
    String usr;

    @Test
    public void testCURP() {
        Estado[] estados = Estado.values();
        Genero[] generos = Genero.values();
        LocalDate fecha = LocalDate.now();
        int i = rnd.nextInt(estados.length);
        int j = rnd.nextInt(generos.length);
        usr = null;
        assertThrows(NullPointerException.class, 
                     () -> { Raro.generarCURP(usr, fecha, estados[i], generos[j]); });
        usr = "";
        assertThrows(NombreInvalidoException.class,
                     () -> { Raro.generarCURP(usr, fecha, estados[i], generos[j]); });
        usr = in.nextLine();
        String[] nombreC = usr.split(" ");
        if (!verificarNombre(nombreC[rnd.nextInt(3)])) {
            assertThrows(NombreInvalidoException.class, 
                         () -> { Raro.generarCURP(usr, fecha, estados[i], generos[j]); });
        }
        String curp = Raro.generarCURP(usr, fecha, estados[i], generos[j]);
        if (curp.length() != 18) {
            assertThrows(NombreInvalidoException.class, 
                         () -> { Raro.generarCURP(usr, fecha, estados[i], generos[j]); });
        }
    }

    @Test
    public void testArmtrong() {
        assertThrows(NullPointerException.class, 
                         () -> { Raro.verificarArmstrong3((Integer) null); });
        int n = rnd.nextInt();
        if (Integer.toString(n).length() != 3) {
            assertThrows(TresCifrasException.class, 
                         () -> { Raro.verificarArmstrong3(n); });
        }
        if (n < 0) {
            assertThrows(NumeroNegativoException.class, 
                         () -> { Raro.verificarArmstrong3(n); });
        }
    }

    @Test
    public void testPotencia() {
        assertThrows(NullPointerException.class, () -> Raro.potencia(null, null));
        assertThrows(NullPointerException.class, () -> Raro.potencia(2, null));
        assertThrows(NullPointerException.class, () -> Raro.potencia(null, 3));
        assertThrows(NumeroNegativoException.class, () -> Raro.potencia(-1, 3));
        assertThrows(NumeroNegativoException.class, () -> Raro.potencia(2, -4));

    }

    @Test
    public void testFactorial() {
        int n = rnd.nextInt();
        if (n < 0) {
            assertThrows(NumeroNegativoException.class, 
                         () -> { Raro.verificarArmstrong3(n); });
        }
    }

    @Test
    public void testFelicidad() {

    }

    /**
	 * Verifica que un nombre sea v&aacute;lido. Si lo es, lo devuelve.
	 * @return {@code <String>} : nombre v&aacute;lido.
	 */
	private static boolean verificarNombre(String nombre) {
		String regex = "^[A-Z][a-z]{1,}\\s[A-Z][a-z]{1,}\\s[A-Z][a-z]{1,}$";
	    return nombre.matches(regex);
	}
    
}