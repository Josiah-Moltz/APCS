// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int countX(String str) {
    if (str.equals("x")) {
    return 1;
  }
  if ( str.length() <= 1 ) {
    return 0;
  }
  return countX( str.substring(0,str.length()-1 ) ) + countX( str.substring(str.length()-1 ) );
}

/* tree-y
public int countX(String str) {
    if (str.equals("x")) {
    return 1;
  }
  if ( str.length() <= 1 ) {
    return 0;
  }
  return countX( str.substring(0,str.length()/2 ) ) + countX( str.substring(str.length()/2 ) );
}
*/
