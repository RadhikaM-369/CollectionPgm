package streamsAPIExamples;

import java.util.Arrays;
import java.util.List;

public class CustomerInfoFilters {

	public static void main(String[] args) {
		
		//list of customers objects:
		List<CustomerInfo> customerList=Arrays.asList(
								new CustomerInfo("Tom", 30),
								new CustomerInfo("Steve",31),
								new CustomerInfo("Lisa", 32),
								new CustomerInfo("Nora", 23));	
		//1. filter -findAny
		CustomerInfo customer=customerList.stream()
				.filter(x-> "Lisa".equals(x.getName()))
				.findAny()//if it finds then return
				.orElse(null);
		
		System.out.println(customer.getName()+" "+customer.getAge());
		System.out.println("------------------");
		//2.filter-didnt findAny
		CustomerInfo customer1=customerList.stream()
										   .filter(x->"Naveen".equals(x.getName()))
				.findAny()//if it finds then return
				.orElse(null);
		System.out.println(customer1);
		System.out.println("------------------");
		
		//3. filter with multiple conditions
		CustomerInfo customer2=customerList.stream()
					.filter((x) -> "Nora".equals(x.getName())&& 23==x.getAge())
					.findAny()
					.orElse(null);
					
		System.out.println(customer2.getName()+" "+customer2.getAge());
	}

}
