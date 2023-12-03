package evaluvation_1;

import java.util.*;
class Employee{
	int id;
	void Employee(int id){
		this.id=id;
	}
}
class Compa implements Comparator<Employee>{

	

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.id>o2.id) {
			  return 1;
		}else if (o1.id<o2.id) {
		      return -1;
		}else
			return 0;
	}

}
public class Sortkeys_Treemap {

	public static void main(String[] args) {
		TreeMap hs=new TreeMap();
		 hs.put(91,"raja");
		 hs.put(45,"janu");
		 hs.put(65,"mano");
		 hs.put(1,"remo");
		 hs.put(12,"priya");
		System.out.println(hs);
	}

}
