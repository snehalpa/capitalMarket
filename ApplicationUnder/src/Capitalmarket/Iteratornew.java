package Capitalmarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratornew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars= new ArrayList<>();
		cars.add("Toyota");
		cars.add("I10");
		cars.add("Maruti");
		cars.add("safari");
		cars.add("Enova");
		
		//By Using For Loop
		System.out.println("For Loop: ");
		for(int i=0; i< cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
		// By using While Loop
		System.out.println("\n\n While Loop");
		int i=0;
		while(i< cars.size()) {
			System.out.println(cars.get(i++) +" ");
		}
		//By using Iterator (hasNext, next,remove)
		System.out.println("\n\n Inetrator Loop");
		Iterator <String>iterator= cars.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
			
		}
		//By using ListIterator (hasNext, next,remove)
				System.out.println("\n\n Inetrator Loop");
				ListIterator <String>it= cars.listIterator();
				while(it.hasNext()) {
					System.out.println(it.next()+" ");
	}

}
}
