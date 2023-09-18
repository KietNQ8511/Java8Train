package lambda__expressions;

public class LambdaExpressions {
<<<<<<< HEAD
	/**
	 * lampda expression basically expresses an instance of the functional interface, 
	 * in other words, you can say it provides a clear and concise way to represent a method of the functional interface using expression
	 * lampda expresssions are added in Java 8
	 */
	
	/* interface definition */
	
	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}
	
	// Performs FuncInter1's operation on 'a' and 'b'
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}
	/* interface definition end */
	
	
	public static void main(String[] args) {
		FuncInter1 add = (int x, int y) -> x + y;
		
		FuncInter1 multiply = (int x, int y) -> x * y;
		
		LambdaExpressions tobj = new LambdaExpressions();
		
		System.out.println("Addition is " + tobj.operate(2, 17, add));
		
		System.out.println("Multiplication is " + tobj.operate(4, 6, multiply));
		
		FuncInter2 fobj = message -> System.out.println("Hello " + message);
		fobj.sayMessage("Geek");
	}
	
}


interface FuncInterface {
	
	void abstractFun(int x);
	
	default void normalFun() {
		System.out.println("Defaul method interface");
	}
	
}
/**======================================================================*/



// Performs FuncInter1's operation on 'a' and 'b'

=======
	
}
>>>>>>> 0481cd6 (first commit)
