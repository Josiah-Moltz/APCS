public class Methods{
  public static void main(String [] args){
    System.out.println(isDivisible(3,1));
    System.out.println(isDivisible(3,2));
    System.out.println(isTriangle(1,1,1));
    System.out.println(isTriangle(1,2,3));
    System.out.println(ack(2,0));
    System.out.println(ack(2,1));
    System.out.println(ack(2,2));
    System.out.println(ack(2,3));
    System.out.println(ack(3,0));
    System.out.println(ack(3,1));
    System.out.println(ack(3,2));
    System.out.println(ack(3,3));
  }

  public static boolean isDivisible(int n, int m){
    return (n % m == 0);
  }

  public static boolean isTriangle(int a, int b, int c){
    return (a + b > c) && (b + c > a) && (c + a > b);
  }

  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    } else if (m > 0 && n == 0){
      return ack(m-1,1);
    } else if (m > 0 && n > 0){
      return ack(m-1,ack(m,n-1));
    } else return 0;
  }
}
