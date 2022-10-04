package streamsAPIExamples;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
	
	/* print 1 to 100 without using any loop
		1. recursive function
		2.Java streams
	*/
	public static void main(String[] args) {
		
	//	IntStream.range(1, 101).forEach(e->System.out.println(e));
	//	printNum(1);
		printNumbers(10, 20);
		}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		}
	
	public static void printNumbers(int startNum,int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNumbers(startNum, endNum);
		}
	}
}
