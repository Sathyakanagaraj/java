package evaluvation_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_nullValues_Check {
	public static void main(String[] args) {
	ArrayList  arr = new ArrayList ();
	   arr.add(5);
	   arr.add(20);
	   arr.add(53);
	  arr.add(null);
	   arr.add(null);
	   arr.add(15);
	   arr.add(null);
	   arr.add(79);
	   arr.add(null);
	   arr.add(null);
	   arr.add(52);
	   arr.add(null);
	   arr.add(2);
	   arr.add(55);
	   arr.add(90);

	   System.out.println("arraylist class -infinite null values are allowed  ");
	   System.out.println(arr);
	   LinkedList <Integer> larr = new LinkedList <Integer>(arr);
	   System.out.println("LinkedList class -infinite null values are allowed");
	   System.out.println(larr);

	   Vector  varr = new Vector(arr);
	   System.out.println("vector class  -infinite null values are allowed ");
	   System.out.println(varr);

	   Stack sarr=new Stack();
	   sarr.push(arr);
	   System.out.println("stack class -infinite null values are allowed  ");
	   System.out.println(sarr);

	   PriorityQueue  parr = new PriorityQueue();
	   parr.add(5);
	   parr.add(20);
	   parr.add(53);
	  // parr.add(null);
	  // parr.add(null);
	   parr.add(15);
	   parr.add(79);
	   System.out.println("PriorityQueue class - null values are NOT allowed  ");
	   System.out.println(parr);

	   ArrayDeque  adarr = new ArrayDeque();
	   adarr.add(5);
	   adarr.add(20);
	   adarr.add(53);
	  // adarr.add(null);
	  // adarr.add(null);
	   adarr.add(15);
	   adarr.add(79);
	   System.out.println("arraydeque class  -null values are NOT allowed ");
	   System.out.println(adarr);

	   HashSet  harr = new HashSet(arr);
	   System.out.println("hashset class - ONE null value is allowed which is stored in 0th INDEX  ");
	   System.out.println(harr);

	   LinkedHashSet  lharr = new LinkedHashSet(arr);
	   System.out.println("linkedhashset class -ONE null value is allowed which is stored in 1st appearance index ");
	   System.out.println(lharr);

	   TreeSet  tarr = new TreeSet(adarr);
	   System.out.println("treeset class -null values are NOT allowed  ");
	   System.out.println(tarr);



}


}
