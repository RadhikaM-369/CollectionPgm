package functionalInterface;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		/*
		 Interface Supplier<T>
		Type Parameters:
		T - the type of results supplied by this supplier
		Functional Interface:
		This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

		@FunctionalInterface
		public interface Supplier<T>
		Represents a supplier of results.
		There is no requirement that a new or distinct result be returned each time the supplier is invoked.

		This is a functional interface whose functional method is get().
		 */
		getText(()->"Java");
		getText(()->"R");
		getText(()->"AWS");
		
	}

	public static void getText(Supplier<String> text) {
		System.out.println(text.get());
	}
}
