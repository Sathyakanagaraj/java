package evaluvation_1;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_array {

	public static void main(String[] args) {
	   	 ArrayList <Integer> a = new ArrayList();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
a.add(5);
a.add(6);
   Collections.shuffle(a);
	System.out.println("The shuffled value of a  "+a);

	}

}
