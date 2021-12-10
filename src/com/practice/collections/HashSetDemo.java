package com.practice.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null); //null insertion is possible in HashSet
		System.out.println(h); //O/p : [null, B, C, D, Z] insertion order is not preserved.
		System.out.println(h.add("Z")); // return false duplicates not allowed in HashSet
		System.out.println(h); // O/P : [null, B, C, D, Z]

	}

}
