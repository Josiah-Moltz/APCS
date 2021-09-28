public class Hello{
	public static void main(String [] args){
		// (// is a comment) Prints "Hello, World" in the terminal window.
		System.out.println("Hello world!");
	}
}
/*
(c) stands for compile error
(r) stands for runtime error
2.
	a. If main is left out,
	Identifier expected (c)
	b. If String is left out
	Illegal start of type (c)
	c. If Hello is left out
	Illegal start of type (c)
	d. If System.out is left out
	Cannot find symbol println (c)
	e. If println is left out
	Cannot find symbol.
	Symbol: method out(String)
	Location: class System (c)

3.
	a. If the ; is left out,
	';' expected (c)
	b. If the first " is left out,
	Unclosed string leteral (c)
	c. If the second " is left out,
	Unclosed string leteral (c)
	d. If the first { is left out
	'{' expected (c)
	e. If the second { is left out
	';' expected (c)
	class interface or enum expected (on the }) (c)
	f. If the first } is left out
	Reached end of file while parsing } (c)
	g. If the second } is left out
	Reached end of file while parsing } (c)

For problem 4 misspelled implies left out the second letter

4.
	a. If main is misspelled
	Class found on application class path: Hello (r)

	I think this error is an (r) only because min is already a function

	b. If String is misspelled
	cannot find symbol
  symbol:   class Sring
  location: class Hello (c)
	c. If Hello is misspelled
	Class Hllo is public, should be declared in a file named Hllo.java (c)
	d. If System.out is misspelled
	package Sstem does not exist (c)
	e. If println is misspelled
	cannot find symbol
  symbol:   method pintln(String)
  location: variable out of type PrintStream

Compile errors will appear like this:
<filename>.java:<line of error>: error: <error message>
*/
