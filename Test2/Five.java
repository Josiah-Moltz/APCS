public class Five {
  public static int classField;
  public int instanceField;

  public static void classMethod(int x) {
    classField = 13;
    //instanceField = 17;
    classMethod( 19);
    //instanceMethod( 23);
  }

  public void instanceMethod(int y) {
    classField = 29;
    instanceField = 31;
    classMethod( 37);
    instanceMethod( 41);
  }
}
