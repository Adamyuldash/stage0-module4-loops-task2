package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;

        while (i <= printToInclusive) {
            boolean z = true;
            int j = 2;  //i = 6
            while (j < i) {
                if (i % j == 0) {
                    z = false;
                    break;
                }
                j++;
            }
            if (z) System.out.println(i);
            i++;
        }

    }


}
