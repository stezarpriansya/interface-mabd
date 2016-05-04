package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.LinkedListNode;
import data.structure.mabd.radityopw.pojo.Person;


public class LinkedListNode_5213100131 implements data.structure.mabd.radityopw.LinkedListNode {
    Person person = null;
    LinkedListNode next, prev = null;

    @Override
    public LinkedListNode next() {
        return this.next;
    }

    @Override
    public LinkedListNode removeNext() {
        LinkedListNode temp = this.next;
        this.next=null;
        return temp;
    }

    @Override
    public void addNext(LinkedListNode linkedListNode) {
        this.next = linkedListNode;
    }

    @Override
    public LinkedListNode prev() {
        return this.prev;
    }

    @Override
    public LinkedListNode removePrev() {
        LinkedListNode temp = this.prev;
        this.prev = null;
        return temp;
    }

    @Override
    public void addPrev(LinkedListNode linkedListNode) {
        this.prev = linkedListNode;
    }

    @Override
    public Person value() {
        return this.person;
    }

    @Override
    public void setValue(Person person) {
        this.person = person;
    }
}
