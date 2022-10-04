package streamsAPIExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterExample {
	public static void main(String[] args) {
		//list of customers objects:
				List<CustomerInfo> customerList=Arrays.asList(
										new CustomerInfo("Tom", 30),
										new CustomerInfo("Steve",31),
										new CustomerInfo("Lisa", 32),
										new CustomerInfo("Nora", 23));	
	String name1=customerList.stream()
					.filter(x->"Tom".equals(x.getName()))
					.map(CustomerInfo::getName)
					.findAny()
					.orElse(null);
	System.out.println(name1);
	//print all names from list:
	List<String> customerList1=customerList.stream()
	.map(CustomerInfo::getName)
	.collect(Collectors.toList());
	customerList1.forEach(System.out::println);
	}
}
