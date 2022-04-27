// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// L09 -- Some Folks Call It A Charades
// 2022-04-26
// time spent:

import java.util.*;
import java.io.*;

/**
 * The framework for the Celebrity Game project
 *
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	 private Celebrity gameCelebrity;

	/**
	 * The GUI frame for the Celebrity game.
	 */

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	 private ArrayList<Celebrity> celebGameList;

	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		prepareGame(); // DD genius
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		celebGameList = new ArrayList<Celebrity>();
	}

	/**
	 * Determines if the supplied guess is correct.
	 *
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		if (guess.trim().toLowerCase().equals(gameCelebrity.getAnswer().toLowerCase())) {
			celebGameList.remove(0);
			if(celebGameList.size()==0) {
				gameCelebrity = new Celebrity("","");
			}
			else {
				gameCelebrity = celebGameList.get(0);
			}
			return true;
		}
		return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader in = new BufferedReader( isr );
		String celebrity, clue, type;
		celebrity = clue = type = "";	// garbage code, MJ doesn't like
		while (celebGameList.size() < 2) {
			try {
				System.out.println("Name a celebrity!");
				celebrity = in.readLine();
				System.out.println("Give a clue to help guess the celebrity!");
				clue = in.readLine();
				System.out.println("What type of celebrity is this?");
				type = in.readLine();
			}
			catch ( IOException e ) { }
			addCelebrity(celebrity, clue, type);
		}
		if (celebGameList != null && celebGameList.size() > 0) {
			this.gameCelebrity = celebGameList.get(0);
		}
		while (!gameCelebrity.getAnswer().equals("")) {	// really cool bc normally celebs have to have at least 4 characters
			System.out.println("The clue is " + gameCelebrity.getClue());
			System.out.println("Who do you think it is?");
			try {
				processGuess(in.readLine());
			}
			catch ( IOException e ) { }
		}
		System.out.println("Congorats!! You won all on your own (quite literally)!!");
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 *
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		if (validateCelebrity(name) && validateClue(guess,type)) {
			celebGameList.add(new Celebrity(name, guess));
		}
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return name.length() > 3;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		return (clue.length() > 9 || clue.contains(",")) && (type.equals("LiteratureCelebrity") || type.equals("Celebrity"));
	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 *
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 *
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return null;
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 *
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return null;
	}

	public static void main(String[] args) {
		CelebrityGame ruawatrain = new CelebrityGame();
		ruawatrain.play();
	}
}
