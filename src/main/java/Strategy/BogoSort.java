package main.java.Strategy;

public class BogoSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        while (!isSorted(array)) {
            shuffle(array);
        }
    }

    private boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
    
}
