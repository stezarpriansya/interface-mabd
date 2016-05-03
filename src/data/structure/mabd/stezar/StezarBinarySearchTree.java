package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.BinarySearchTreeIntInterface;
import data.structure.mabd.radityopw.pojo.Person;
import jdk.nashorn.internal.objects.annotations.Function;

/**
 * Created by user on 5/3/16.
 */
public class StezarBinarySearchTree implements BinarySearchTreeIntInterface {
    int head = -1;
    Person data = null;
    StezarBinarySearchTree left = null;
    StezarBinarySearchTree right = null;

    @Override
    public void insert(int i, Person person) {
        if (head == -1) {
            this.head = i;
            this.data = person;
            left = new StezarBinarySearchTree();
            right = new StezarBinarySearchTree();
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
