package functional__interface;

public class TestFunctionalInterface {
	/**
	 * 	Java has forever remained an Object-Oriented Programming language
	 *  By object-oriented programming language, 
	 *  	we can declare that everything present in the Java programming language
	 *  rotates throughout the Objects,
	 *  Except for some of the primitive data types and primitive methods for integrity and simplicity
	 *  There are no solely functions present in a programming language called Java.
	 *  Functions in the Java programming are part of a class,
	 *  	and if some one want to use them, they have to use the class or object of the class to call any function
	 */
	
	/**
	 * Functional interface additionally recognized as Single Abstract Method Interfaces. 
	 * In short, they are also know as SAM interfaces.
	 * Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming.
	 */
	
	/**
	 * Functional interfaces are included in Java SE 8 with lambda expressions and method references 
	 * in order to make code more readable, clean, and straightforward.
	 */
	
	public static void main(String[] args) {
		
		// pre java 8
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();
		
		
		
		/**
		 * From java8, we can assign lambda express to its functional interface object like this:
		 */
		// lambda expression to create the object
		new Thread(() -> {
			System.out.println("New thread created using lambda expression !!");
		}).start();;
		
	}
}
