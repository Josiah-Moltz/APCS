public class Fence {
	public static String fence(int a) {
		if (a == 1) { return "|";}
		return fence(a - 1) + "--|";
	}
	public static void main(String[] args) {
		System.out.println(fence(1));
		System.out.println(fence(2));
		System.out.println(fence(3));
	}
}
