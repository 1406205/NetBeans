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
public class LinkedList_ {
    //reference to head node
    private Node_ head;
    private int nodeCount;
    
    // LinkedList ctor
    public LinkedList_()
    {
        // this is an empty list
        // the reference to the head node
        // is set to a new node without data
        head = new Node_(null);
        nodeCount = 0;
    }
    
    public boolean isEmpty()
    {
        return (this.head.next == null) ? true : false;
    }
    
    public int append(Integer data)
    {
        Node_ temp = new Node_ (data);
        Node_ current = head;
        // start at the head node, traverse the list
        while(current.getNext() != null)
        {
            current = current.getNext();
        }
        current.setNext(temp);
        return nodeCount++;
    }
    
    public int addToFront(Integer data)
    {
        Node_ temp = new Node_(data);
        temp.setNext(head.getNext());
        head.setNext(temp);
        return this.nodeCount++;
    }
    
    public int removeFromFront()
    {
        head.setNext(head.getNext().getNext());
        return this.nodeCount--;
    }
    
    public LinkedList_ traverse()
    {
        Node_ current = head;
        while(current.getNext() != null)
        {
            current = current.getNext();
            System.out.println("[traverse]" + current.getValue());
        }
        return this;
    }
    
    public int size()
    {
        return nodeCount;
    }
}
