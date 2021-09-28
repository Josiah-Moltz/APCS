public class Loops{
  public static void main(String [] args){
    for (double i = .1; i <= 100; i = i * 10) {
      check(i);
    }

    for (double j = -.1; j >= -100; j = j * 10) {
      check(j);
    }
  }


  public static double squareRoot(double a){
    double guess;
    guess = 2.0;
    while ((1e-6 < guess - (guess + a / guess) / 2) || (guess - (guess + a / guess) / 2 < -1e-6)){
      // Makes an error bound of up to 6 decimal places
      guess = (guess + a / guess) / 2;
      // Newtons method
    }
    return guess - guess % 1e-6;
    // Ensures answer only has up to 6 decimal places
  }

  public static double power(double x, int n){
    int counter;
    double answer;
    counter = 0;
    answer = 1;
    if (n > 0) {
      while (counter < n) {
        answer = answer * x;
        counter = counter + 1;
      }
    } else {
      while (counter > n) {
        answer = answer / x;
        counter = counter - 1;
      }
    }
    return answer;
  }

  public static int factorial(int n){
    int counter, answer;
    counter = 1;
    answer = 1;
    while (counter <= n) {
      answer = answer * counter;
      counter = counter + 1;
    }
    return answer;
  }

  public static double myexp(double x, int n){
    int counter;
    double term, sum;
    counter = 1;
    term = 1;
    sum = 1;
    while (counter <= n) {
      term = term * x / counter;
      sum = sum + term;
      counter = counter + 1;
    }
    return sum;
  }

  public static void check(double x){
    System.out.print(x);
    System.out.print("\t");
    System.out.print(myexp(x, 17));
    System.out.print("\t");
    System.out.println(Math.exp(x));
  }
}
