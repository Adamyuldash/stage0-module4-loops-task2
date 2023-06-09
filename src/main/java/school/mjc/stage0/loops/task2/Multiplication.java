package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int product = 1;

        while (i <= multiplyByAndToInclusive) {
            if (i < 1) {
                product = -product;
            }
            for (int j = 1; j <= i; j++) {
                product *= j;
            }
            System.out.println(product);
            i++;
        }
    }
}