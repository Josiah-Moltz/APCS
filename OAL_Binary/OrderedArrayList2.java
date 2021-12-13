// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList2
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList2() {
    _data = new ArrayList<Integer>();
  }

  public String toString()
  {
    return _data.toString();
  }

  public Integer remove( int i )
  {
    return _data.remove(i);
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    int index = 0;
    while (index < size() && newVal > get(index)) {
      index += 1;
    }
    _data.add(index, newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    System.out.println(_data);
    System.out.println(newVal); //problem with first val
    int start = 0;
    int middle = 0;
    int oldMiddle = 0;
    int finish = size();
    while (finish != start && finish != 0){
      oldMiddle = middle;
      middle = (start + finish) / 2;

      if (newVal < get(middle)){
        finish = middle;
      }
      else {
        start = middle;
      }
      System.out.println("Finish: " + finish);
      System.out.println("Start: " + start);
    }
    _data.add(middle,newVal);
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList2 Franz = new OrderedArrayList2();

    // testing linear searchadd(middle, newVal);
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList2();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
