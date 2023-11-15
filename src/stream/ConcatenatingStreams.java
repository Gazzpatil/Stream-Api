package stream;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
public class ConcatenatingStreams {

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("tom","cat","pat");
		List<String>list2=Arrays.asList("parrot","pigeon","duck");
	Stream<String> s1	=list1.stream();
	Stream<String> s2=list2.stream();
	Stream.concat(s1,s2).forEach(System.out::println);
	}

}
