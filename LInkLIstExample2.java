package com.company.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkLIstExample2 {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(12);
	list.add(13);
	list.add(14);
	list.add(15);
	list.add(16);
	System.out.println(list);
	list.addFirst(11);
	list.addLast(17);
	for(int i:list) {
		System.out.println(i);
	}
	System.out.println("\n");
	list.removeFirst();
	list.removeLast();
	Iterator<Integer> iterator =list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}
}
