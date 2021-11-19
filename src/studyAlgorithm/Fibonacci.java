package studyAlgorithm;

public class Fibonacci {
    // recursive call  활용
    public int factorialFunc(int data) {
        if (data <= 1) {
            return data;
        }
        return this.factorialFunc(data - 1) + this.factorialFunc(data - 2);
    }
    // Dynamic  활용
    public int dynamicFunc(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index < data + 1; index++) {
            cache[index] = cache[index - 1] + cache[index - 2];
        }
        return cache[data];
    }

}
