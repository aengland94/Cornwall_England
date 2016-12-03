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
public class PlayerControlExceptions extends Exception{

    public PlayerControlExceptions() {
    }

    public PlayerControlExceptions(String message) {
        super(message);
    }

    public PlayerControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerControlExceptions(Throwable cause) {
        super(cause);
    }

    public PlayerControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
