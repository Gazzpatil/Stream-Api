package map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LengthStr {

	public static void main(String[] args) {
		List<String> string=Arrays.asList("bus","car","bicycle","flight","train"); 
		List<String> lenString=new ArrayList<String>();
		
		string.stream().map(m->m.length()).forEach(System.out::println);
		
		

	}

}
