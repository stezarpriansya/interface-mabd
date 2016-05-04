package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.HashTableInterface;
import data.structure.mabd.radityopw.pojo.Person;


public class HashTable_5213100131 implements HashTableInterface {

    public class HashEntry {

        private int key;
        private Person value;

        HashEntry(int key, Person value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public Person getValue() {
            return value;
        }
    }
    private final static int TABLE_SIZE = 128;

    HashEntry[] table;

    HashTable_5213100131() {
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    HashTable_5213100131(int size) {
        table = new HashEntry[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    @Override
    public void put(Object o, Person person) {
        int key = (Integer) o;
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % TABLE_SIZE;
        }
        table[hash] = new HashEntry(key, person);
    }

    @Override
    public Person del(Object o) {
        return null;
    }

    @Override
    public boolean isExist(Object o) {
        return false;
    }

    @Override
    public Person get(Object o) {
        int key = (Integer) o;
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % TABLE_SIZE;
        }
        if (table[hash] == null) {
            return new Person("null", "null", -1);
        } else {
            return table[hash].getValue();
        }
    }
}
