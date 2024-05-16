package com.company.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample3 {
     public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(32);
		list.add(10);
		list.add(14);
		list.add(29);
		list.add(34);
		list.add(13);
		System.out.println("OriginalArray"+list);
//		int first=0;
//		int last=list.size()-1;
//		int max=0;
//		int min=0;
//		for(int i=0;i<last;i++) {
//			if (list.get(first)<list.get(i+1)) {
//				min=list.get(first);
//			}else {
//				min=list.get(i+1);
//				first=i+1;
//			}
//		}
//		for(int i=0;i<last;i++) {
//			if (list.get(first)>list.get(i+1)) {
//				max=list.get(first);
//			}else {
//				max=list.get(i+1);
//				first=i+1;
//			}
//		}
		
		int max=Collections.max(list);
		int min=Collections.min(list);
		System.out.println("Minimum:"+min);
		System.out.println("Maximum:"+max);
		
		Collections.sort(list);
		System.out.println("Sort List in ascending order:"+list);
		
		Collections.shuffle(list);
		System.out.println("Shuffle List:"+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Order Sort List:"+list);
	}
}
