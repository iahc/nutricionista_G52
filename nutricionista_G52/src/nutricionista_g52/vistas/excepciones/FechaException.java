/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g52.vistas.excepciones;

/**
 *
 * @author Matías Pacheco
 */
public class FechaException extends Exception {

    /**
     * Creates a new instance of <code>FechaException</code> without detail message.
     */
    public FechaException() {
    }

    /**
     * Constructs an instance of <code>FechaException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public FechaException(String msg) {
        super(msg);
    }
}
