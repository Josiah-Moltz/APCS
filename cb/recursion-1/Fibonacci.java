// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int fibonacci(int n) {
 if ( n == 0 ) {
   return 0;
 }
 if ( n == 1 ) {
   return 1;
 }
 return fibonacci( n-1 ) + fibonacci( n-2 );
}
