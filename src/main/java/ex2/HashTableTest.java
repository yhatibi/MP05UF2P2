package ex2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void addAtHash() {
        HashTable hashTable = new HashTable();
        int items = 8;
        String key1 = "12";
        String value= "hello world";
        hashTable.put(key1, value);

        Assertions.assertEquals(value, hashTable.get(key1));


        // Añadir 8 ITEMS some key values.
        addItems(hashTable, items);

        for (int i = 0; i < items ; i++) {
            final String string = String.valueOf(i);
            Assertions.assertEquals(string, hashTable.get(string));
        }

        System.out.println(hashTable.toString());
    }


    @Test
    public void getHash() {
        HashTable hashTable = new HashTable();
        int items = 8;

        // Añadir 8 ITEMS some key values.
        addItems(hashTable, items);

        for(int i=0; i<items; i++) {
            final String key = String.valueOf(i);
            Assertions.assertEquals(key, hashTable.get(key));

        }


    }

    @Test
    public void dropHash() {
        HashTable hashTable = new HashTable();
        String key = "12";
        String value= "hello world";
        hashTable.put(key, value);
        hashTable.put(key, value);
        System.out.println(hashTable.toString());

        //Borrar hashEntry
        hashTable.drop(key);

        System.out.println(hashTable.toString());

        Assertions.assertEquals(null, hashTable.get(key));

    }

    @Test
    public void countHash() {
        HashTable hashTable = new HashTable();
        int items = 8;

        // Añadir 8 ITEMS some key values.
        addItems(hashTable, items);

        // Quitar 2 items
        hashTable.drop("2");
        hashTable.drop("3");
        System.out.println(hashTable.count());

        Assertions.assertEquals(6, hashTable.count());
    }

    @Test
    public void sizeHash() {
        HashTable hashTable = new HashTable();
        Assertions.assertEquals(16, hashTable.size());
    }


    //Metodo Refaccion
    private void addItems(HashTable hashTable, int items) {
        for (int i = 0; i < items; i++) {
            final String key = String.valueOf(i);
            hashTable.put(key, key);
        }
    }



}
