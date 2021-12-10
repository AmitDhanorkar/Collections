package com.practice.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("A");
		arrayList.add(10);//Heterogeneous objects are allowed
		arrayList.add("A");//Duplicates objects are allowed
		arrayList.add(null);//null insertion is possible
		System.out.println(arrayList); //insertion order is preserved
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2,"M");
		arrayList.add("N");
		System.out.println(arrayList);

	}

}
