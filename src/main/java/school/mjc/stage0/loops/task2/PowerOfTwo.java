package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int i = 0;
        int result = 1;

        while (i <= power) {
            result += 2;
            System.out.println(result);
            i++;
        }
    }
}
