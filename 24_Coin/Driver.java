// TNPG Tin Pig: Josiah Moltz and Corina Chen
// APCS pd06
// HW23 -- What Does Equality Look Like? / Pair Programming / Creating Coin.java and testing it in Driver.java
// 2021-10-24
// Time Spent: 0.7 hours (42 minutes)

/*

DISCO
* Null can be compared (bc it worked in our code and did not return errors!)
  (Even when it's not set to a certain value, it still ran)
* "this.<name>" help clears up name-space errors

QCC
* Does Java always initialize variables as null?
* Are there any other uses for "this.<name>"?

*/

/***
    driver for class Coin

    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {
	Coin tinPig = new Coin("quarter");
	
	while (tinPig.getFlipCtr() < 66165) {
		tinPig.flip();
	}
	System.out.println("Heads: " + tinPig.getHeadsCtr());
	System.out.println("Tails: " + tinPig.getTailsCtr());
	System.out.println("Flips: " + tinPig.getFlipCtr());
  }//end main()

}//end class
