package Iterator;

import java.util.Iterator;

class FibonacciIterator implements Iterator<Integer> {
    private int prev = 0;
    private int curr = 1;
    private int count = 0;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (count == 0) {
            count++;
            return 1;
        } else if (count == 1) {
            count++;
            return 1;
        } else {
            int nextVal = prev + curr;
            prev = curr;
            curr = nextVal;
            count++;
            return nextVal;
        }
    }
}

