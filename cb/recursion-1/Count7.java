// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int count7(int n) {
  if ( n == 7 ) {
    return 1;
  }
  if ( n < 10 ) {
    return 0;
  }
  return count7( n%10 ) + count7( n/10 );
}
