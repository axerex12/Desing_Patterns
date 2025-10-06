package Iterator;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
