package com.practice.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		
		  LinkedHashSet h = new LinkedHashSet(); 
		  h.add("B"); 
		  h.add("C"); 
		  h.add("D");
		  h.add("Z"); 
		  h.add(null); //null insertion is possible in HashSet
		  System.out.println(h); //O/p : [B, C, D, Z, null] insertion order is preserved. 
		  System.out.println(h.add("Z")); // return false duplicates not allowed in HashSet 
		  System.out.println(h); // O/P : [B, C, D, Z, null]
		 
	}

}
