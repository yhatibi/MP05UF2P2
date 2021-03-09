package ex1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class HashTableTest {

    @Test
    public void addAtHash() {
        HashTable hashTable = new HashTable();
        String key = "12";
        String value= "hello world";
        hashTable.put(key, value);

        Assertions.assertEquals(value, hashTable.get(key));

        for(int i = 0; i<8; i++) {
            final String string = String.valueOf(i);
            hashTable.put(string, string);
        }

        for (int i = 0; i < 8 ; i++) {
            final String string = String.valueOf(i);
            Assertions.assertEquals(string, hashTable.get(String.valueOf(i)));
        }

        System.out.println(hashTable.toString());
    }

    @Test
    public void dropHash() {
        HashTable hashTable = new HashTable();
        String key = "12";
        String value= "hello world";
        hashTable.put(key, value);

        //Borrar hash
        hashTable.drop(key);

        Assertions.assertEquals(null, hashTable.get(key));

    }

    @Test
    public void countHash() {
        HashTable hashTable = new HashTable();
        int i=0;
        // Put some key values.



        for(; i<8; i++) {
            final String key = String.valueOf(i);
            hashTable.put(key, key);
        }

        //
        System.out.println(hashTable.size());

        Assertions.assertEquals(hashTable, hashTable.count());
    }

    @Test
    public void sizeHash() {
        HashTable hashTable = new HashTable();
        int i=0;
        // Put some key values.
        for(; i<8; i++) {
            final String key = String.valueOf(i);
            hashTable.put(key, key);
        }

        //
        System.out.println(hashTable.toString());

        //
        String[] lines = hashTable.toString().split("\r\n|\r|\n");
        int sizeLines =  lines.length;


        Assertions.assertEquals(sizeLines, hashTable.size());
    }









}
