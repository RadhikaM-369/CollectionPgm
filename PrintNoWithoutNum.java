package streamsAPIExamples;

public class PrintNoWithoutNum {

	public static void main(String[] args) {
		
		int one='A'/'A';
		
		for(int i=one;i<='d';i+=one) {
			System.out.println(i);
		}
		System.out.println("---- using String---");
		String s="..........";
		for(int i=one; i<=(s.length()*s.length());i++){
		System.out.println(i);	
		}
	}

}
