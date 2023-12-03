package evaluvation_1;

import java.util.HashMap;

public class Shallow_copy {

	public static void main(String[] args) {
 HashMap hs=new HashMap();
 hs.put(91,"raja");
 hs.put(45,"janu");
 hs.put(65,"mano");
 hs.put(1,"remo");
 hs.put(12,"priya");
System.out.println(hs);
HashMap hs2= hs;
System.out.println("shallow copy  "+hs2);

	}

}
