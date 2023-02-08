package lessons.lesson_4;

import java.util.*;

// Deque - Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах

public class Ex003 {
    public static void main(String[] args) {
        DequeDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}