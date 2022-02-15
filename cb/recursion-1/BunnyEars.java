// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int bunnyEars(int bunnies) {
  if ( bunnies == 0 ) {
    return 0;
  }
  return 2 + bunnyEars( bunnies-1 );
}
