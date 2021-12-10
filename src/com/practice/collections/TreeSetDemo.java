package com.practice.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("z");
		t.add("L");
		//t.add(new Integer(10)); //throws clascastexception as Treeset not allowed heterogeneous object.
		//t.add(null); //NullPointerException when we add null
		System.out.println(t); //O/P: [A, B, L, a, z] insertion order is preserved
		

	}

}
