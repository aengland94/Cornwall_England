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

    public MapExceptions(String string) {
        super(string);
    }

    public MapExceptions(String string, Throwable cause) {
        super(string, cause);
    }

    public MapExceptions(Throwable cause) {
        super(cause);
    }

    public MapExceptions(String string, Throwable cause, boolean bln, boolean bln1) {
        super(string, cause, bln, bln1);
    }
    
}
