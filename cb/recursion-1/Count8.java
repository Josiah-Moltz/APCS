// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int count8(int n) {
  if ( n == 0 ) {
    return 0;
  }
  if ( n%10 == 8 && (n/10)%10 == 8 ) {
    return 2 + count8( n/10 );
  }
  if ( n%10 == 8 ) {
    return 1 + count8( n/10 );
  }
  return count8( n/10 );
}
