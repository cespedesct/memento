/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
public class Persona implements Cloneable {
    private String nombre;
    private String apellido;
    private int telefono;
    Object estado;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
     public Memento saveToMemento() throws CloneNotSupportedException{
           estado=new Object();
           estado=this.clone();
           return new Memento(estado);
    }

    public void restoreFromMmento(Memento m){
            estado = m.getSavedState();
        
    }
    
    
}
