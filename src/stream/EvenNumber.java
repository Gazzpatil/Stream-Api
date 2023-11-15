package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(10,40,50,70,80,91,13);
		List<Integer> evenNum=new ArrayList<Integer>();
		
//	evenNum=	num.stream().filter(even->even%2==0).collect(Collectors.toList());
//		System.out.println(evenNum);
		num.stream().filter(even->even%2==1).forEach(System.out::println);
		
	}

}
