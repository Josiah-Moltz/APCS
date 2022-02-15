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
