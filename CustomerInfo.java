package streamsAPIExamples;

public class CustomerInfo {
 
	private String name;
	private int age;
	
	public CustomerInfo(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
