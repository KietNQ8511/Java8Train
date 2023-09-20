package lambda__expressions;

public class LambdaExpressCodeForRefactory {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int addVal = cal.operate(1, 5, cal.add);
		System.out.println(addVal);
	}
}

class Cal {
	
	interface Func {
		int operation(int a, int b);
	}

	int operate(int a, int b, Func f) {
		return f.operation(a, b);
	}

	Func add = (a, b) -> a + b;
	Func multiply = (a, b) -> a * b;

}
