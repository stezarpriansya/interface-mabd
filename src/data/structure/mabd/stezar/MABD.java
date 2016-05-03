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

        StezarLinkedListNode ll1 = new StezarLinkedListNode();
        StezarLinkedListNode ll2 = new StezarLinkedListNode();
        StezarLinkedListNode ll3 = new StezarLinkedListNode();

        ll1.setValue(p1);
        ll2.setValue(p2);
        ll3.setValue(p3);

        ll2.addPrev(ll1);
        ll2.addNext(ll3);

        StezarBinarySearchTree btree = new StezarBinarySearchTree();
        btree.insert(7, p3);
        btree.insert(3, p3);
        btree.insert(11, p3);
        btree.insert(1, p3);
        btree.insert(5, p3);
        btree.insert(10, p1);
        btree.insert(15, p3);
        btree.insert(4, p3);

        btree.delete(5);

        System.out.println(btree.find(4).data().nama());
    }
    
}