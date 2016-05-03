/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.mabd.stezar;

import data.structure.mabd.radityopw.HashTableInterface;
import data.structure.mabd.radityopw.pojo.Person;

/**
 *
 * @author Stezar Priansya
 */
public class HashTableFunction implements HashTableInterface {
    private final static int TABLE_SIZE = 128;
    Person myPerson;

    @Override
    public void put(Object o, Person person) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public Person del(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return myPerson;
    }

    @Override
    public boolean isExist(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public Person get(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return myPerson;
    }
    
}
