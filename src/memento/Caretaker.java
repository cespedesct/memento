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
public class Caretaker {
    private ArrayList <Memento> estados= new ArrayList <Memento>();
    public void addMemento(Memento m){
        estados.add(m);
    }
    public Memento getMemento(int index){
        return estados.get(index);
    }
}
