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
public class Memento {
    private Persona estado;
    public Memento (Persona estado){
        this.estado=estado;
    }
    public Persona getSavedState(){
        return estado;
    }
}
