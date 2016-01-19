/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures1;

import java.util.Random;


/**
 *
 * @author 1406205
 */
public class Datastructures1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList_ lili = new LinkedList_();
        System.out.println(lili.isEmpty());
        System.out.println("--------------------");
        System.out.println(lili.append(1000));
        System.out.println("--------------------");
        System.out.println(lili.isEmpty());
        System.out.println("--------------------");
        System.out.println(lili.append(1001));
        System.out.println("--------------------");
        System.out.println(lili.append(1002));
        System.out.println("--------------------");
        System.out.println(lili.append(1003));
        System.out.println("--------------------");
        lili.traverse();
        System.out.println("--------------------");
        for(int i = 1; i < 10; i++)
        {
            System.out.println(lili.addToFront((5000 + i)));
        }
        System.out.println("--------------------");
        System.out.println(lili.traverse());
        System.out.println("--------------------");
        lili.removeFromFront();
        lili.removeFromFront();
        System.out.println(lili.traverse());
        System.out.println("--------------------");
        
//        BinaryTree_ bin = new BinaryTree_();
//        System.out.println("In order Binary Tree");
//        for(int i = 0; i <25; i++)
//        {
//            Random rand = new Random();
//            int random = rand.nextInt(500); // assigns a random number between 0 and 499
//            bin.insert(random); // inserts the random number
//        }
//        bin.inOrderTraversal();
        
//        int[] array_ = {254, 122, 899, 344, 789, 665, 119, 701, 300, 565, 844, 319};
//    
//        for (int k : array_)
//        {
//            System.out.println("key: " + k + " hash (n = 100) -> " + k % 100 + " hash (n = 97) -> " + k % 97);
//        }
        
//        String sfh = "averylongkey";
//    
//        int hash = 0;
//        int n = 97;
//        int a = 127;
//    
//        for(int i = 0; i < sfh.length(); i++)
//        {
//            hash = (a*hash + sfh.charAt(i) ) % n;
//        }
//        System.out.println ("String sfh: " + sfh + " ... hash of string sfh: " + hash);
        
        
        
        
//        String[] array_ = {"A" , "thing", "of", "Beauty", "is" , "a", "joy", "forever", "it's", "loveliness", "increases"};
//    
//        int n = 50;
//        int a = 127;
//        int hash = 0;
//        
//        
//        for(int k = 0; k < array_.length(); k++)
//        {
//            hash = (a*hash + array_.charAt(k) ) % n;
//            System.out.println ("String s: " + array_(k) + " ... hash of string s: " + hash);
//        }
    }
    
}
