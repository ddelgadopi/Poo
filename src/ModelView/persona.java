/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

/**
 *
 * @author Estudiante
 */
public abstract class persona {
    String nombre;
    int nit;
    int teléfono;
    
    abstract void autenticar();
    abstract void crear();
}
