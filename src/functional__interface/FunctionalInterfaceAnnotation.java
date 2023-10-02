package functional__interface;

public class FunctionalInterfaceAnnotation {
	/**
	 * @FunctionalInterfae annotation is used to ensure that the functional interface can't have more than one abstract method.
	 * In case more than one abstract methods are present,
	 * 	 the compiler flags an "Unexpected @FunctionalInterface annotation" message
	 * However, it is not mandatory to use this annotation.
	 */
	public static void main(String[] args) {
		int a = 5;
		
		// lambda expression to define the calculate method
		Square s = (x) -> x * x;
		
		int ans = s.calculate(a);
		System.out.println(ans);
	}
	
}


@FunctionalInterface
interface Square {
	int calculate(int x);
}