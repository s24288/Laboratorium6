package Zadanie3;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("White");
        tree1.add("Black");
        tree1.add("Red");
        tree1.add("Brown");
        tree1.add("Silver");

        System.out.println("A. three1: " + tree1);
        System.out.print("B. Iterated three1: ");

        Iterator<String> iterator = tree1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }

        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Green");
        tree2.add("Yellow");
        tree2.add("Blue");

        System.out.println("\nC. three2: " + tree2);

        Iterator<String> iterator2 = tree2.iterator();
        while (iterator2.hasNext()) {
            tree1.add(iterator2.next());
        }

        System.out.println("C. three1: " + tree1);
        System.out.println("D. Reverse tree1: " + tree1.descendingSet());
        System.out.println("E. tree1 first: " + tree1.first());
        System.out.println("E. tree1 last: " + tree1.last());

        TreeSet tree3;
        tree3 = (TreeSet)tree1.clone();

        System.out.println("F. three3: " + tree3);
        System.out.println("G. three3 elements: " + tree3.size());
        System.out.println("H. Comparison:\n");

        for (String s : tree1) {
            System.out.println("Is the <<" + s + ">> in both trees?: ");
            if (tree2.contains(s)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

}
