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
public class Originator {
    private Persona estado;

    public Persona getEstado() {
        return estado;
    }

    public void setEstado(Persona estado) {
        this.estado = estado;
    }
    
    public Memento saveToMemento(){
        
    return new Memento(estado);
    }
    
    public void restoreFromMemento(Memento m){
      this.estado=m.getSavedState();
    }
}
