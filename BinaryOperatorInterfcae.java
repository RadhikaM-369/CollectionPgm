package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfcae {

	public static void main(String[] args) {
	/*
	 @FunctionalInterface
	public interface BinaryOperator<T>
	extends BiFunction<T,T,T>
	Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
	This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
	This is a functional interface whose functional method is BiFunction.apply(Object, Object).
	 */
		BinaryOperator<Integer> func=(x1, x2) ->x1+x2;
	int result=	func.apply(10, 20);
	System.out.println(result);
		
	//BiFunction Interface
	
	BiFunction<Integer, Integer,Integer> func1 = (x1,x2) -> x1+x2;
	
	int result1=func1.apply(30, 40);
	System.out.println(result1);
	
	}
}
