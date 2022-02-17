/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;
  private int solutions;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }

  public int totalSolutions()
  {
    solutions = 0;
    solutionAdder(0);
    return solutions;
  }

  private void solutionAdder( int col )
  {
    for (int row = 0; row < _board.length; row++) {
      if ( addQueen( row, col ) ){
        if ( col == _board.length-1 ) {
          solutions++;
        }
        else {
          solutionAdder( col+1 );
        }
        removeQueen( row, col );
      }
    }
  }

  public void allSolutions()
  {
    solutionPrinter(0);
  }

  private void solutionPrinter( int col )
  {
    for (int row = 0; row < _board.length; row++) {
      if ( addQueen( row, col ) ){
        if ( col == _board.length-1 ) {
        printSolution();
        }
        else {
          solutionPrinter( col+1 );
        }
        removeQueen( row, col );
      }
    }
  }

  public boolean solve()
  {
    return solveH(0);
  }


    /**
     *Helper method for solve.
     */
  private boolean solveH( int col )
  {
    if ( col >= _board.length ) { // we've been through the whole board, not a problem!!
      printSolution();  // print the solution
      return true;
    }

    for (int row = 0; row < _board.length; row++) {
      if ( addQueen( row, col ) ){
        if ( solveH( col+1 ) ) {
          return true;
        }
        removeQueen( row, col );
      }
    }
    return false;
  }

    public void printSolution()
    {
      /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
      */
      String ans = "";
      for( int r = 0; r < _board.length; r++ ) {
        for( int c = 0; c < _board[0].length; c++ ) {
          if (_board[r][c] != 1) {
            ans += "_ "; // personally I think space looks better than tab but :(
          }
          else {
            ans += "Q ";
          }
        }
        ans += "\n";
      }
      System.out.println(ans);
    }

  //================= YE OLDE SEPARATOR =================

  /***
   * If inoccupied, places a queen and marks all spaces to the right (upper right, right, bottom right) as in danger.
   * precondition: _board exists and initialized; row and col are valid (< n)
   * postcondition: places a queen if the position was not occupied / in danger. otherwise, the
   * board remains unchanged.
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * "Undo" the actions of addQueen
   * precondition: _board exists and initialized; row and col are valid (< n)
   * postcondition: removes a queen if the position is occupied. otherwise, board remains unchanged.
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * Prints the board
   * precondition: _board initialized and exists
   * postcondition: The board is printed
   */
  public String toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {

    QueenBoard b = new QueenBoard(8);
    System.out.println(b.totalSolutions());
    b.allSolutions();


  }

}//end class
