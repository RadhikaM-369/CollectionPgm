package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		/*
		 Type Parameters:
		T - the type of the input to the predicate
		Functional Interface:
		This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

		@FunctionalInterface
		public interface Predicate<T>
		Represents a predicate (boolean-valued function) of one argument.
		This is a functional interface whose functional method is test(Object).
		
		functions-default and(),default or(),static isEqual(),default negate(),boolean test()
		 */
		Predicate<Integer> func= x -> x>5;
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> colList=list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(colList);
		
		//predicate with &&:
		List<Integer> colList1=list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		
		System.out.println("----------- using &&--------");
		System.out.println(colList1);
		
		//predicate with negate():
		List<String> namesList=Arrays.asList("Tom","Lisa","Christin","James");
		Predicate<String> names=x -> x.startsWith("To");
		
		
		
		List<String> newNamesList=namesList.stream().filter(names.negate()).collect(Collectors.toList());
		System.out.println("----------- using negate()--------");
		System.out.println(newNamesList);
	
		
	}

}
