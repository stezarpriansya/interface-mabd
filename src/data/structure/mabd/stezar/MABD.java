/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.pojo.Person;

/**
 *
 * @author Stezar Priansya
 */
public class MABD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Foobar");
        Person p1 = new Person("KODE123", "Stezar", 100);
        Person p2 = new Person("KODE321", "Priansya", 101);
        Person p3 = new Person("KODE999", "Radityo", 102);

        LinkedListNode_5213100131 ll1 = new LinkedListNode_5213100131();
        LinkedListNode_5213100131 ll2 = new LinkedListNode_5213100131();
        LinkedListNode_5213100131 ll3 = new LinkedListNode_5213100131();

        ll1.setValue(p1);
        ll2.setValue(p2);
        ll3.setValue(p3);

        ll2.addPrev(ll1);
        ll2.addNext(ll3);

//        BinarySearchTree_5213100131 btree = new BinarySearchTree_5213100131();
//        btree.insert(7, p3);
//        btree.insert(3, p3);
//        btree.insert(11, p3);
//        btree.insert(1, p3);
//        btree.insert(5, p3);
//        btree.insert(10, p1);
//        btree.insert(15, p3);
//        btree.insert(4, p3);
//
//        btree.delete(5);
//
//        System.out.println(btree.find(4).data().nama());
    }
    
}