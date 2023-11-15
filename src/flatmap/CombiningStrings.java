package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombiningStrings {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Scott","David","John");
		List<String> list2=Arrays.asList("Mary","luna","tom");
		List<String> list3=Arrays.asList("Ken","john","kitty");
		
		List<List<String>> list=Arrays.asList(list1,list2,list3);
		
//		by using for each
	/**
	 * 	for(List<String> names:list) {
	 
			for(String name:names) {
				System.out.print(name+" ");
			}
		}
	 */
		list.stream().flatMap(n->n.stream().map(name->name.toUpperCase())).forEach(System.out::println);
		
	}

}
