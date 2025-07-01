package practica7.app;

import java.time.LocalDate;

import practica7.enums.Estado;
import practica7.enums.Genero;
import practica7.exep.*;

/**
 * 
 * @author
 * @version 1.0
 */
public class Raro {

    /**
     * 
     * @param nombre
     * @param fechaNac
     * @param estado
     * @param genero
     * @throws
     * @return
     */
    public static String generarCURP(String nombre, LocalDate fechaNac, Estado estado, Genero genero) {}
    
    /**
     * 
     * @param n
     * @throws
     * @return
     */
    public static boolean verificarArmstrong3(int n) {}

    /**
     * 
     * @param n
     * @param k
     * @throws
     * @return
     */
    public static double potencia(int n, int k) {}

    /**
     * 
     * @param <T>
     * @param n
     * @throws
     * @return
     */
    public static <T extends Number> T dobleFactorial(T n) {}
        
    /**
     * 
     * @param n
     * @throws
     * @return
     */
    public static boolean verificarFelicidad(int n) {}
}