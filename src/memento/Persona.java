/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Fabricio
 */
public class Persona {
    private String nombre;
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Memento saveToMemento(){
        
    return new Memento(nombre);
    }
    
    public void restoreFromMmento(Memento m){
      nombre=m.getSavedState();
    }
    
}
