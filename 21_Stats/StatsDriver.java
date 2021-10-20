public class StatsDriver {
	public static void main(String[] args) {
		Stats cjb = new Stats();
		
		System.out.println(cjb.mean(2,8));
		System.out.println("Answer should be 5");
		System.out.println(cjb.mean(2.0,8.0));
		System.out.println("Answer should be 5.0");
		System.out.println(cjb.max(2,8));
		System.out.println("Answer should be 8");
		System.out.println(cjb.max(2.0,8.0));
		System.out.println("Answer should be 8.0");
		System.out.println(cjb.geoMean(2,8));
		System.out.println("Answer should be 4");
		System.out.println(cjb.geoMean(2.0,8.0));
		System.out.println("Answer should be 4.0");
		
		System.out.println(cjb.mean(3,10));
		System.out.println("Answer should be 6");
		System.out.println(cjb.mean(3.0,10.0));
		System.out.println("Answer should be 6.5");
		System.out.println(cjb.max(3,10));
		System.out.println("Answer should be 10");
		System.out.println(cjb.max(2.91,2.89));
		System.out.println("Answer should be 2.91");
		System.out.println(cjb.geoMean(2,3));
		System.out.println("Answer should be 2");
		System.out.println(cjb.geoMean(2.0,3.0));
		System.out.println("Answer should be about 2.449");
		
		System.out.println(cjb.mean(-5,-5));
		System.out.println("Answer should be -5");
		System.out.println(cjb.mean(-5.0,-5.0));
		System.out.println("Answer should be -5.0");
		System.out.println(cjb.max(-5,-5));
		System.out.println("Answer should be -5");
		System.out.println(cjb.max(-5.0,-5.0));
		System.out.println("Answer should be -5.0");
		System.out.println(cjb.geoMean(-5,-5));
		System.out.println("Answer should be 5");
		System.out.println(cjb.geoMean(-5.0,-5.0));
		System.out.println("Answer should be 5.0");
		
	}
}
