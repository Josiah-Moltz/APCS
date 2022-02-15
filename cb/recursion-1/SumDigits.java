// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int sumDigits(int n) {
  if ( n == 0 ) {
    return 0;
  }
  return n%10 + sumDigits( n/10 );
}
