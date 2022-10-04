package functionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		/* Interface Function<T,R> type parameters:
		 * T- type of input to function, R-type of result of function
		 * R apply<T t>-return result
		 */
		Function<String,Integer> func= x-> x.length();
		
		int len=func.apply("This is Function interface");
		System.out.println(len);
		
		//chaining function:
		Function<Integer,Integer> func1= x -> x*2;
		int result =  func.andThen(func1).apply("This is concept of Stream API");//29
		System.out.println(result);
	}

}
