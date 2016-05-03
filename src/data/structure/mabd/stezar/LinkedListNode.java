package data.structure.mabd.stezar;

/**
 * LinkedListNode merupakan interface 
 * untuk doubly linked list {https://en.wikipedia.org/wiki/Doubly_linked_list}
 * @author radityopw
 */
public interface LinkedListNode {
    
    
    /**
     * method next digunakan untuk mengembalikan 
     * next Node , jika tidak ada maka kembalikan null
     * @return LinkedListNode
     */
    public LinkedListNode next();
    
    
    /**
     * method removeNext berarti akan membuat next LinkedlistNode
     * menjadi null, 
     * jika sebelum operasi ini, next LinkedListNode tidak null maka kembalikan 
     * namun jika memang null maka kembalikan null saja.
     * @return LinkedListNode
     */
    public LinkedListNode removeNext();
    
    /**
     * 
     * method ini bertujuan untuk memberi nilai baru pada next LinkedListNode
     * @param node adalah sebuah variabel bertipe LinkedListNode
     */
    public void addNext(LinkedListNode node);
    
    
    /**
     * method prev digunakan untuk mengembalikan 
     * prev Node , jika tidak ada maka kembalikan null
     * @return LinkedListNode
     */
    public LinkedListNode prev();
    
    /**
     * method removeNext berarti akan membuat prev LinkedlistNode
     * menjadi null, 
     * jika sebelum operasi ini, prev LinkedListNode tidak null maka kembalikan 
     * namun jika memang null maka kembalikan null saja.
     * @return LinkedListNode
     */
    public LinkedListNode removePrev();
    
    /**
     * 
     * method ini bertujuan untuk memberi nilai baru pada prev LinkedListNode
     * 
     * @param node adalah sebuah variabel bertipe LinkedListNode
     */
    public void addPrev(LinkedListNode node);
    
    /**
     * mengembalikan nilai pada sebuah LinkedListNode
     * @return Object
     */
    public Object value();
    
    /**
     * menyimpan nilai pada LinkedListNode
     * @param object adalah sebuah variabel bertipe Object
     */
    public void setValue(Object object);
    
}
