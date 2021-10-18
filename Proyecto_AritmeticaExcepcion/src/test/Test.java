package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {
        
        try {
            int res = 0;
            
            res = division(10, 0);
        } catch (OperacionExcepcion e) {
           e.printStackTrace(System.out);
        }finally{ //finally-> Es una extensión de la estructura, se va a ejecutar siempre hay ao no excepción
            System.out.println("Siempre estoy: ");
        }
        
        
    }

    
}
