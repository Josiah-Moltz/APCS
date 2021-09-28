import java.util.Arrays;
import java.util.Random;

public class Array{
  public static void main(String [] args){
    System.out.println(Arrays.toString(sieve(25)));
  }

  public static double[] powArray(double[] a, double pow) {
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = Math.pow(a[i], pow);
    }
    return b;
  }

  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
  }

  public static int[] histogram(int[] scores, int counters) {
    int[] hist = new int[(scores.length + counters - 1)/ counters];
    for (int score : scores) {
      hist[score / counters]++;
    }
    return hist;
  }

  public static int indexOfMax(int[] array) {
    int max = array [0];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
        index = i;
      }
    }
    return index;
  }

  public static boolean[] sieve(int n) {
    int[] array = new int[n];
    boolean[] prime = new boolean[n];
    for (int i = 0; i < n; i++) {
      array[i]=i;
    }
    for (int i = 2; i < n; i++) {
      if (array[i] != 0) {
        prime[i]=true;
        // searches for next prime
        int counter = 2;
        while (counter * i < n) {
          // removes multiple of prime
          array[counter * i] = 0;
          counter++;
        }
      }
    }
    return prime;
  }
}
