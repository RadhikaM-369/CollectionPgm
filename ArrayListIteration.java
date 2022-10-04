package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Breaking bad");
		tvSeries.add("The working dead");
		tvSeries.add("Prison break");
		tvSeries.add("The big bang theory");
		
		// using java 8 with foreach loop lambda exp:
		System.out.println("--------Print using java 8 with foreach loop lambda exp--------------");
		tvSeries.forEach(shows-> { System.out.println(shows);});

		//using Iterator:
		System.out.println("-------- print using iterator--------");
		Iterator<String> it=tvSeries.iterator();
		while(it.hasNext()) {
			String shows=it.next();
			System.out.println(shows);
			}
		
		//using iterator and java 8 forEachRenaming() method
		System.out.println("------print using iterator and java 8 forEachRenaming() method-------");
		it=tvSeries.iterator();
		it.forEachRemaining(shows-> {
			System.out.println(shows);
		});//consumer interface
		
		//4. using for each loop:
		System.out.println("------- print using for each loop--------");
		for(String shows:tvSeries) {
			System.out.println(shows);
		}
		
		//5. using for loop with order/index:
		System.out.println("------ print using for loop with order/index-------");
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. using a listIterator() to traverse in both the directions
		
		System.out.println("------- print  using a listIterator() to traverse in both the directions-------");
		ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show=tvSeriesListIterator.previous();
			System.out.println(show);
			}
		}

}
