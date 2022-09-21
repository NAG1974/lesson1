import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] x = {-5, 16, 3};
        int[] y = {0, 23, 18, -5};

        int[] result = new int[x.length + y.length];
        System.out.println(Arrays.toString(result));

        for(int i = 0; i < x.length; i++) {
            result[i] = x[i];
        }
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < y.length; i++) {
            result[i + x.length] = y[i];
        }
        System.out.println(Arrays.toString(result));
    }
    //static int[] nerge(int[] x, int[]y){

      //  return x
    }


