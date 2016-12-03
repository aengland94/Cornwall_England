/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.exceptions;

/**
 *
 * @author Krissy
 */
public class MapExceptions extends Exception {

    public MapExceptions() {
    }

    public MapExceptions(String message) {
        super(message);
    }

    public MapExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public MapExceptions(Throwable cause) {
        super(cause);
    }

    public MapExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
