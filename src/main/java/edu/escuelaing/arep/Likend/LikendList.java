/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.Likend;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Juan Romero
 */
public class LikendList<E> implements List<E> {

    Node<E> first=null;
    Node<E> end=null;
    int size=0;
    /**
     * En este m�todo basicamente lo que hara es retornar el numero de nodos o
     * el tama�o de la lista encadenada
     *
     * @return Integer
     */
    public int size() {
        Node reco = first;
        int tamano = 0;
        while (reco != null ) {
            reco = reco.getNext();
            tamano++;
        }
        return tamano;
    }
     /*
    * LinkedList implementa iterator, este metodo permite la iteracion en nuestra lista encadenada
    */
    @Override
    public Iterator<E> iterator(){
    Iterator<E> iterator;
        iterator = new Iterator<E>() {
            Node actual=first;
            @Override
            public boolean hasNext() {
                boolean flag=false;
                if(actual!=null){
                    flag=true;
                }
                return flag;
            }
            @Override
            public E next(){
               E var =(E)actual.getT();
               if(actual.equals(end)){
                   actual=null;
                }else{
                   actual=actual.getNext();
               }
                return var;  
            }
        };
    return iterator;
    }

    public Object[] toArray(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * En add llega la informaci�n a insertar en un nuevo nodo, si
     * no se ha creado ningun nodo y se hace llamado a este metodo lo creara y
     * lo tomara este como raiz de ser creado actualizara la raiz siendo el
     * nuevo nodo creado y este conocera al nodo anterior.
     *
     * @param e elemento que sera la informacion del nodo
     * @return boolean si se realizo o no la insercion
     */
    public boolean add(E e) {
        Node nuevo=new Node(e);
        if(first==null){
            end=nuevo;
            nuevo.setNext(null);
            first=nuevo;
        }else{
            nuevo.setNext(first);
            first=nuevo;
        }
        return true;
    }
    /**
     * Imprime todos los elementos de los nodos(lista)
     */
    public void print(){
		Node reco = first;
		while (reco != null) {
			//System.out.print(reco.getT() + " HPTAAA");
			reco = reco.getNext();
		}
		System.out.println();
	}
    /**
     * Al tener al objeto este metodo hace la busqueda Nodo por nodo 
     * para buscar dicho objeto y eliminarlo, uniendo lo que iba antes y despues de este
     * de ser el primero o el ultimo solo lo elimina teniendo en cuenta la raiz.
     *
     * @param o elemento que se quiere eliminar
     * @return boolean si se realizo o no la eliminacion del Nodo
     */
    public boolean remove(Object o) {
        Node reco = first;
        Node previous=null;
	E informacion=null;
        boolean flag=false;
	int tamano = size();
	while (tamano != size() && reco != null){
            informacion = (E) reco.getT();
            if(informacion.equals(o)){
                flag=true;
                if(previous!=null){
                    previous.setNext(reco.getNext());
                    first=previous;
                }else{
                   first=first.getNext();
                }
            }else {
                tamano--;
                previous = reco;
                reco = reco.getNext();
            }
	}
        return flag;
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * retorna el elemento del nodo en una posicion en especifico
     *
     * @param index entero que representa la posicion en la lista
     * @return E elemento del nodo
     */
    public E get(int index) {
        Node reco = first;
	E informacion=null;
	int tamano = size();
	while (tamano != index && reco != null) {
            informacion = (E) reco.getT();
            tamano--;
            reco = reco.getNext();
	}
	return informacion;
    }

    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
