import java.util.ArrayList;

public class NT {
  public static int order( int k, int p ) {
    for ( int i = 1; i < p/2+1; i++ ) {
      if ( (p - 1) % i == 0 ) {
        int j = i;
        int x = 1;
        while ( j > 0 ) {
          x = (x*k)%p;
          j--;
        }
        if ( (x - 1) % p == 0 ) {
          return i;
        }
      }
    }
    return p-1;
  }

  public static boolean primitive( int k, int p ) {
    return order( k,p ) == p-1;
  }

  public static ArrayList<Integer> orbit( int k, int p ) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(k);
    int exp = 1;
    while ( exp < order( k,p ) ) {
      result.add( ( result.get(exp-1) * k ) % p);
      exp++;
    }
    return result;
  }

  public static void main(String[] args) {
    for (int i = 1; i < 31; i++) {
      if (order(i,31) == 15) {
        System.out.println(orbit(i,31));
      }
    }
  }
}
