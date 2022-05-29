package Zadanie2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i <= 20; i++) {
            hashSet.add(i);
        }

        System.out.println("Orginal hashSet: " + hashSet);

        Object[] table = hashSet.toArray();

        System.out.print("Copied to table: ");
        for (Object i : table) {
            System.out.print(i + ", ");
        }
    }
}
