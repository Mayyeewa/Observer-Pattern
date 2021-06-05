package lesson1;

import java.util.LinkedList;
import java.util.List;
import acmx.export.java.util.Collections;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> stringlist = new LinkedList<String>();
		stringlist.add("Item 1");
		stringlist.add("cars");
		stringlist.add("apples");
		stringlist.add("zebra");
		stringlist.add("pineapple");
				
		Collections.sort(null);
		
			int i = 0; 
			for (int =i; i<stringlist.size(); i++) {	
				System.out.println(stringlist.get(i));
			}				
	}
}
