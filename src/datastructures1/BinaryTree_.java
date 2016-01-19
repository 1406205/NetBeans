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
public class BinaryTree_ {
    private Treenode root;
    private int numberOfNodes = 0;
    
    public BinaryTree_()
    {
        this.root = null;
        this.numberOfNodes = 0;
    }
    
    public boolean isEmpty()
    {
        return (numberOfNodes == 0);
    }
    
    public Treenode getRoot()
    {
        return this.root;
    }
    
    public int getNodeCount()
    {
        return this.numberOfNodes;
    }
    
    public int insert(int newValue)
    {
        Treenode temp;
        Treenode current;
        Treenode parent;
        
        if(this.root == null) //tree is empty
        {
            temp = new Treenode(newValue);
            this.root = temp;
            this.numberOfNodes++;
        }
        else // tree is not empty
        {
            temp = new Treenode(newValue);
            current = root;
            while(true) //infinite while
            {
                parent = current;
                if(newValue< current.getValue())
                {//go left
                    current = current.getLeft();
                    if(current == null)
                    {
                        parent.setLeft(temp);
                        return this.numberOfNodes++; //break out of loop
                    }
                }
                else
                {// go right
                    current = current.getRight();
                    if(current == null)
                    {
                        parent.setRight(temp);
                        return this.numberOfNodes++;
                    }//if
                }//while
            }//else
        }
        return this.numberOfNodes++;
    }
    
    // inorder traverse
    protected void inOrderT(Treenode tnode)
    {
        if(tnode != null)
        {
            inOrderT(tnode.getLeft());
            System.out.println(tnode.getValue());
            inOrderT(tnode.getRight());
        }
    }
    public void inOrderTraversal()
    {
        inOrderT(this.root);
    }
}
