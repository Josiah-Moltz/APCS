public class Time{
	public static void main(String [] args){
		int hour, minute, second, sinceMidnight;
    hour = 16;
    minute = 9;
    second = 21;
    sinceMidnight = 3600 * hour + 60 * minute + second;
    System.out.println("Current time " + hour + ":" + minute + ":" + second);
    System.out.println("Seconds since midnight: " + sinceMidnight);
    System.out.println("There are " + (24 * 60 * 60 - sinceMidnight) + " seconds left in the day");
    System.out.println(sinceMidnight * 100 / (24.0 * 60.0 * 60.0) + " % of the day is gone");
	}
}
