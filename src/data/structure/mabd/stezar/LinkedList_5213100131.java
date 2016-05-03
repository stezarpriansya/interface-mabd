/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.mabd.stezar;

/**
 *
 * @author Stezar Priansya
 */
public class LinkedList_5213100131 {
    static class Node implements LinkedListNode{
        Object data;
        Node next = null;
        Node prev = null;
        
        @Override
        public LinkedListNode next() {
            return next;
        }

        @Override
        public LinkedListNode removeNext() {
            LinkedListNode temp = next;
            next=null;
            return temp;
        }

        @Override
        public void addNext(LinkedListNode node) {
            if (next == null){
                next = (Node) node;
            }
            else {
                next.addNext(node);
            }
        }

        @Override
        public LinkedListNode prev() {
            return prev;
        }

        @Override
        public LinkedListNode removePrev() {
            LinkedListNode temp = prev;
            prev=null;
            return temp;
        }

        @Override
        public void addPrev(LinkedListNode node) {
            if (prev == null){
                prev = (Node) node;
            }
            else {
                prev.addPrev(node);
            }
        }

        @Override
        public Object value() {
            return data;
        }

        @Override
        public void setValue(Object object) {
            data = object;
        }
        
    }

    public static void main (String[] args){
        Object data = 2;
        Node myLinked = new Node();
        Node satu = new Node();
        satu.setValue(data);
        myLinked.addNext(satu);
        System.out.println(satu.value());
    }
}
