package flatmap;

import java.util.Arrays;
import java.util.List;
class Student
{
	int id;
	String name;
	char grade;
	Student(int id,String name,char grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
}

public class ObjectCreation {
	public static void main(String[] args) {
		List<Student> n1=Arrays.asList(new Student(1,"gazz",'A'),new Student(2,"patil",'C'));
		List<Student> n2=Arrays.asList(new Student(4,"jessy",'A'),new Student(5,"walter",'D'));
		
		List<List<Student>> n=Arrays.asList(n1,n2);
		n.stream().flatMap(s->s.stream().map(name->name.grade)).forEach(System.out::println);
	}
	
	
}
