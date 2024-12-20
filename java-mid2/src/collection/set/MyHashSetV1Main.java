package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        set.add(9);
        set.remove(9);
        System.out.println(set);

        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
    }
}
