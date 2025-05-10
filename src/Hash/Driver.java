package Hash;

public class Driver {
    public static void main(String[] args) {
        OpenHash ht = new OpenHash(8);
        ht.insert(10,"data10");
        ht.insert(2, "data2");
        ht.insert(5, "data5");
        ht.insert(0, "data0");
        ht.insert(9, "data9");
        ht.insert(3, "data3");
        ht.insert(16, "data16");
        ht.insert(17, "data17");
        ht.printHashTable();
    }
}
