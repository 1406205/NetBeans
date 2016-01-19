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
public class Treenode {
    private Integer value;
    private Treenode left;
    private Treenode right;
    
    Treenode (Integer v)
    {
        this.value = v;
        this.left = null;
        this.right = null;
    }
    
    public Integer setValue(Integer v)
    {
        this.value = v;
        return this.value;
    }
    
    public Integer getValue()
    {
        return this.value;
    }
    
    public Treenode getLeft()
    {
        return left;
    }
    
    public Treenode getRight()
    {
        return right;
    }
    
    public Treenode setLeft(Treenode next)
    {
        this.left = next;
        return this.left;
    }
    
    public Treenode setRight(Treenode next)
    {
        this.right = next;
        return this.right;
    }
}
