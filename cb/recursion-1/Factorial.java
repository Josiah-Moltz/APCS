// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int factorial(int n) {
  if ( n == 1 ) {
    return 1;
  }
  else {
    return n * factorial( n-1 );
  }
}
