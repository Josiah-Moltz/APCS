// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int bunnyEars2(int bunnies) {
 if ( bunnies == 0 ) {
   return 0;
 }
 if ( bunnies%2 == 0 ) {
   return 3 + bunnyEars2( bunnies-1 );
 }
 return 2 + bunnyEars2( bunnies-1 );
}
