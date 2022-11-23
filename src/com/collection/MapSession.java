package com.collection;


import java.util.*;
import java.util.Map.Entry;

public class MapSession {
	public static void main(String[] args) {
//        Map a=new HashMap();
//        Map a=new HashTable();
//        Map a=new LinkedHashMap();
        Map a=new TreeMap();
		
		a.put("1", "apple");
		a.put("2", "grape");
		a.put("3", "kiwi");
		System.out.println(a);
		//a.remove("3");
		//System.out.println(a);
		//a.clear();
		boolean t=a.isEmpty();
		System.out.println(t);
		int r=a.size();
		System.out.println(r);
		Set<Entry<Integer,String>> v=a.entrySet();
		System.out.println(v);
		for (Entry<Integer,String> b:v) {
			System.out.println(b);
			Collection<String>n=a.values();
			System.out.println(n);
			Set<Integer> m=a.keySet();
			System.out.println(m);
		}
		
		
		
	}

}
