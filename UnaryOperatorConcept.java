package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {
		/*		 
		@FunctionalInterface
		public interface UnaryOperator<T>
		extends Function<T,T>
		Represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.
		This is a functional interface whose functional method is Function.apply(Object).
		andThen,apply,compose
				
		 */
		
		UnaryOperator<Integer> func = x -> x*7;
		
		int result=func.apply(10);
		System.out.println(result);
		
		Function<Integer, Integer> func1= x -> x*10;
		System.out.println(func1.apply(50));
		
		//modifying data
		
		List<String> languages=new ArrayList<String>();
		languages.add("JAVA");
		languages.add("Python");
		languages.add("Ruby");
		
		System.out.println(languages);
		
		languages.replaceAll(ele -> "Programming");
		System.out.println(languages);

	}

}
