package evaluvation_1;

import java.util.ArrayList;

public class Student {
	String Name;
    String Course;
    
  	 ArrayList <String> a = new ArrayList <String>();
  	 
    void Student(String name,String course) {
   	 Name=name;
   	 Course=course;
    }
    void course_add(String e) {
        System.out.println("course to be added   "+e);
        a.add(e);
    }
    void course_remove(String e) {
        System.out.println("course to be removed   "+e);
        a.remove(e);
    }
    void display() {
        System.out.println("Student name:   "+Name);
        System.out.println("Student major:   "+Course); 
        System.out.println("Student course:   "+a);

    }
	public static void main(String[] args) {
		Student obj=new Student();
		obj.Student("raja", "BE");
		obj.course_add("ece");
		obj.course_add("eee");
		obj.course_add("cse");
		obj.course_remove("eee");

       obj.display();
	}

}
