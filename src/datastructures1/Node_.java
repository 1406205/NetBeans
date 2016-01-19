/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures1;

/**
 *
 * @author 1406205
 */
public class Node_ {
    
    public Integer value; // can be any type
    public Node_ next; // reference to node
    
    Node_ (Integer v)
    {
        this.value = v;
        this.next = null;
    }
    // overloaded ctor
    Node_ (Integer v, Node_ n)
    {
        this.value = v;
        this.next = n;
    }
    
    // accessors and mutators
    public Integer setValue(Integer v)
    {
        this.value = v;
        return this.value;
    }
    
    public Integer getValue()
    {
        return this.value;
    }
    
    public Node_ getNext()
    {
        return next;
    }
    
    public Node_ setNext(Node_ next)
    {
        this.next = next;
        return this.next;
    }
    
}
