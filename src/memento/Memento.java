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
public class Memento {
    private Object estado;
    public Memento (Object estado){
        this.estado=estado;
    }
    public Object getSavedState(){
        return estado;
    }
}
