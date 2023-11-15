package map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class upperCase {

	public static void main(String[] args) {
		List<String> string= Arrays.asList("bus","car","bicycle","flight","train");
		List<String> upper=new ArrayList<String>();
		string.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		
		
		
	}

}
