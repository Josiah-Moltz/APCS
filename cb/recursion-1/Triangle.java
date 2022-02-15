// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int triangle(int rows) {
  if ( rows == 0 ) {
    return 0;
  }
  return rows + triangle( rows-1 );
}
