package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(1);
        deque.push(3);
        System.out.println("deque = " + deque);
    }

}
