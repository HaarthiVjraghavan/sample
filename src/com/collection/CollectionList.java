package com.collection;
//list

import java.util.*;



public class CollectionList {
	public static void main(String[] args) {
	List a=new ArrayList();
	a.add(224);
	a.add("haarthi");
	a.add(456.78f);
	a.add(67585.5675d);
	a.add(3);
	System.out.println(a);
    Object e=a.get(3);
    System.out.println(e);
    Object r=a.indexOf("haarthi");
    System.out.println(r);
    Object t=a.lastIndexOf(3);
    System.out.println(t);
    Object u=a.contains(224);
    System.out.println(u);
    List y=new LinkedList();
    y.add(45);
    y.addAll(a);
    System.out.println(y);
    boolean o=y.equals(a);
    System.out.println(o);
    boolean h=y.containsAll(a);
    System.out.println(h);
    List b=new Vector();
    b.add(12);
    b.addAll(a);
    System.out.println(b);
    Object m=b.retainAll(a);
    System.out.println(m);
    
    Set v=new HashSet();
    v.add(4567);
    v.add("rtyh");
    v.add(4536.876f);
    System.out.println(v);
    Set l=new TreeSet();
    l.add(234);
    l.add(3545);
    l.add(4);
    System.out.println(l);
    Set c=new LinkedHashSet();
    c.add(45);
    c.add(5689);
    l.remove(4);
    System.out.println(l);
 
    System.out.println(c);
    
    
    
    
    
    
    }
	

}
