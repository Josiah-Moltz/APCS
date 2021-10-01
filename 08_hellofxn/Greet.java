/*
Josiah Moltz
APCS
HW08 -- Refactor Freshie Zero/Java Review/Making a method to greet people in Java
2021--09--30
*/

/*
DISCOVERIES
-.gitignore tells git what files to ignore when pushing to the cloud
-In .gitignore, an asterix infront of a file extension (like *.class) means that extension is ignored
-public and static MUST BE INCLUDED in function definitions
-ALL VARIABLES MUST BE NAMED!!
-If a function is defined to take a parameter, that parameter must be included in the function call
-class names MUST (letter for letter) match the file name

UNRESOLVED QUESTIONS
-What are public and static for??

*/

public class Greet {
	public static void main(String[] args){
		greet("Jacob");
		greet("Amir");
		greet("Josiah");
	}

	public static void greet(String name) {
		System.out.println("Josiah gives you a warm welcome, "+name);
	}
}
