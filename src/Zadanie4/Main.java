package Zadanie4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        Scanner scanner = new Scanner(System.in);

        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        System.out.println("Enter number from 1 to 12:");

        int choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);
        System.out.print("This is: ");

        if (map.containsKey(choice)) {
            System.out.println(map.get(choice));
        } else System.out.println("Wrong number!");

        System.out.print("All months: ");
        map.forEach((key, value) -> System.out.print(key + " = " + value + ", "));


    }
}
