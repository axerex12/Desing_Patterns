package main.java.Strategy;

import java.lang.reflect.Array;

public class Sorter {
    public static void main(String[] args) {

        ArrayGenerator generator = new ArrayGenerator();
        int[] array30Bubble = generator.generateArray(30);
        int[] array30Selection = generator.generateArray(30);
        int[] array100kSel = generator.generateArray(100000);
        int[] array100kBub = generator.generateArray(100000);
        int[] arrayBogo = generator.generateArray(5);


        SortContext context = new SortContext(new BubbleSort());
        long startTime = System.nanoTime();
        context.sortArray(array30Bubble);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort (30 elements) took " + (endTime - startTime) + " ns");

        context.setStrategy(new BubbleSort());
        startTime = System.nanoTime();
        context.sortArray(array100kBub);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort (100000 elements) took " + (endTime - startTime) + " ns");

        context.setStrategy(new SelectionSort());
        startTime = System.nanoTime();
        context.sortArray(array30Selection);
        endTime = System.nanoTime();
        System.out.println("Selection Sort (30 elements) took " + (endTime - startTime) + " ns");

        context.setStrategy(new SelectionSort());
        startTime = System.nanoTime();
        context.sortArray(array100kSel);
        endTime = System.nanoTime();
        System.out.println("Selection Sort (100000 elements) took " + (endTime - startTime) + " ns");

        context.setStrategy(new BogoSort());
        startTime = System.nanoTime();
        context.sortArray(arrayBogo);
        endTime = System.nanoTime();
        System.out.println("Bogo Sort (5 elements) took " + (endTime - startTime) + " ns");

    }
    
}
