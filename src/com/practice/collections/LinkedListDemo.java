package com.practice.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("amit");
		l.add(30);
		l.add(null);
		l.add("amit");
		System.out.println(l);
		l.set(0, "dhanorkar");
		System.out.println(l);
		l.add(0, "baba");
		System.out.println(l);
		l.removeLast();
		l.addFirst("acc");
		System.out.println(l);
	}

}
