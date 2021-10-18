
package excepciones;

//SE EXTIENDE DE LA CLASE EXCEPTION
public class OperacionExcepcion  extends Exception{
            /*SIEMPRE DEBEN SER MANEJADAS, TENER UN BLOQUE TRAY CATCH
    HAY OTRO BLOQUE TRAY-CATCH-FINALLY*/
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
        
}
