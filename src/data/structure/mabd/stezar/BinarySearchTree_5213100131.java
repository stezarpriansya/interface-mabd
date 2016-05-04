package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.BinarySearchTreeIntInterface;
import data.structure.mabd.radityopw.pojo.Person;


public class BinarySearchTree_5213100131 implements BinarySearchTreeIntInterface {
    int head = -1;
    Person data = null;
    BinarySearchTree_5213100131 left = null;
    BinarySearchTree_5213100131 right = null;

    @Override
    public void insert(int i, Person person) {
        if (head == -1) {
            this.head = i;
            this.data = person;
            left = new BinarySearchTree_5213100131();
            right = new BinarySearchTree_5213100131();
        } else {
            if (head < i) {
                right.insert(i, person);
            } else if (head > i) {
                left.insert(i, person);
            } else if (head == i) {
                this.head = -1;
                this.data = new Person("null", "null", -1);
            }
        }
    }

    @Override
    public BinarySearchTreeIntInterface find(int i) {
        if (head == i) return this;
        if (head < i && right != null) {
            return right.find(i);
        }
        if (head > i && left != null) {
            return left.find(i);
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println(this.data);
    }

    @Override
    public void delete(int i) {
        find(i).insert(i, new Person("", "", -1));
    }

    @Override
    public Person data() {
        return this.data;
    }

}
