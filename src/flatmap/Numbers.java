package flatmap;

import java.util.Arrays;
import java.util.List;
public class Numbers {

	public static void main(String[] args) {
		List<Integer> n1=Arrays.asList(1,2);
		List<Integer> n2=Arrays.asList(3,4);
		List<Integer> n3=Arrays.asList(5,6);
		
		List<List<Integer>> n=Arrays.asList(n1,n2,n3);
//		using for eachloop
//		for(List<Integer> num:n) {
//			for(int number:num) {
//				System.out.print(number*3+" ");
//			}
//		}

//		by using flatMap
		n.stream().flatMap(s->s.stream().map(ss->ss*3)).forEach(System.out::println);;

	}

}
