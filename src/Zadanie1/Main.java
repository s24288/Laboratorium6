package Zadanie1;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(i);
        }

        System.out.println("Orginal list: " + list);
        System.out.println("Element removed: " + list.getFirst());
        System.out.println("Element removed: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("New list " + list);
    }
}
