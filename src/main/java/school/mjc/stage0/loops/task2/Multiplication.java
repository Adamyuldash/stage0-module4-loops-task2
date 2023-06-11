package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int x) {
        if(x == 0) return;
        int  i =0;
        while (Math.abs(x)>=i){
            int product =i*x;
            System.out.println(product);
            i++;

        }
    }
}