import java.util.Scanner;

public class TimeConverter{
	public static void main(String [] args){
		int seconds, minutes, hours;
    Scanner in = new Scanner(System.in);

    // prompt the user and get the value
    System.out.print("How many seconds? ");
    seconds = in.nextInt();

    // convert result
    hours = seconds / 3600;
    minutes = (seconds % 3600) / 60;
    seconds = seconds % 60;

    // display result
    System.out.printf("%d Hours %d Minutes %d Seconds", hours, minutes, seconds);
	}
}
