/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.Likend;

/**
 *
 * @author Juan Romero
 */
class Node<T> {
    private T val= null;
    private Node next= null;
    
    public Node(T e){
        this.val = e;
    }
    
    public void setNext(Node n){
        this.next=n;
    }
    public T getT(){
        return val;
    }
    public void setT(T nuevo){
       this.val=nuevo ;
    }
    public Node getNext(){
        return next;
    }
}
