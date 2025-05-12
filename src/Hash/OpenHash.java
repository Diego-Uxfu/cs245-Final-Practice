package Hash;

public class OpenHash { // open hashing has linear probing by default, no need for long name
    /*
    a good way to think of a hash element is to imagine it
    as a type of node.

    int key is the hash function key
    obj value = wtv you want to store
     */
    private static class HashElement{
        int key;
        Object value;

        public HashElement(int key, Object value) { // constructor
            this.key = key;
            this.value = value;
        }
    }

    private HashElement[] HashTable; // instance var of an arr of hashelements (creates the table)
    private int capacity; // max size of the table

    public OpenHash(int size){ // constructor
        HashTable = new HashElement[size];
        capacity = size;
    }

    /*
    very simple hash function

    hash function is the equation that determines
    the key (hash) value of a value
     */
    private int hash(int key){
        if(key < 0){
            throw new IllegalArgumentException("Key must be greater than or equal to zero");
        }
        return key % capacity;
    }

    public void insert(int key, Object value){
        HashElement newElement = new HashElement(key, value); // create new element with param values
        int index = hash(key); // reference for traversal

        if(HashTable[index] == null){ // base case; if hash is open, insert
            HashTable[index] = newElement;
            return;
        }

        int i = (index + 1) % HashTable.length; // some hack to make it link to the start
        while(HashTable[i] != null && i != index){ // prevents infinite loop -> i != index
            i = (i + 1) % HashTable.length; // continues to probe
        }
        if(HashTable[i] == null){ // inserting at new location
            HashTable[i] = newElement;
        }
        else{
            System.out.println("No se puede insertar el elemento");
        }
    }

    public void printHashTable(){
        System.out.println("HashTable:\n");
        for(HashElement hashElement : HashTable){
            System.out.println("Key: " + hashElement.key + " Value: " + hashElement.value);
        }
        for(int i = 0; i < HashTable.length; i++){
            System.out.println("i: " + i + "key: " + HashTable[i].key + " value: " + HashTable[i].value);
        }
    }
}
