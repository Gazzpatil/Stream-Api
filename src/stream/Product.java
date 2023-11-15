package stream;
import java.util.*;
import java.util.stream.Collectors;
public class Product {
	int id;
	String brand;
	int cost;
	Product(int id,String brand,int cost){
		this.id=id;
		this.brand=brand;
		this.cost=cost;
	}
	public String toString() {
		return "Id is "+id+" brans is "+brand+" cost "+cost;
	}
	public static void main(String[] args) {
		List<Product> obj=new LinkedList<>();
		obj.add(new Product(1,"Lenovo",30200));
		obj.add(new Product(2,"Apple",50030));
		obj.add(new Product(3,"Acer",70084));
		obj.add(new Product(4,"Asus",45600));
		obj.stream().filter(p->p.cost>30000).forEach(System.out::println);
	}
}
