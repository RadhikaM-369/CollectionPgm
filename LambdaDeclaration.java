package lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
	
		/* we cannot create object of interface. create anonymous inner type- this means we dont need to
		 *  create seperate class which is implementing interface, inside that the class we need to override 
		 *  method n there we have to keep method body. so to avoid that perticular task. declare this,
		 *   right hand side text behave like a class.*/
		
	/*	Webpage w1=new Webpage() {
			
			@Override
			public void header(String value) {
				System.out.println("hi this is : "+value);				
			}
		};
		
		Webpage w2=new Webpage() {
			
			@Override
			public void header(String value) {
				System.out.println("hi this is : "+value);				
			}
		};*/
		/* for every reff we are writting no of lines code this can be avoided by lambda expression,
		most of the things are same only business logic is diff (in sysout statement)*/
		
		//w1.header("google");
		//w2.header("path");
		
		Webpage w1=(value,age) -> System.out.println("hi this is : "+value+ ", Age "+age);
		
	//	Webpage w2=(value) -> System.out.println(value.toUpperCase());
	//	Webpage w3=(value1) -> System.out.println(value1.length());
			
		w1.header("Lisa",33);
	//	w2.header("tesla");
	//	w3.header("innovation");
		
	}

}
