package map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class MultiplyCollection {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		num.stream().map(m->m*3).forEach(System.out::println);

	}

}
