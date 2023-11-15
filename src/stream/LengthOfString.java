package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LengthOfString {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("GAzz","Melisandrre","jon","Joffery");
		List<String> longnames=new ArrayList<String>();
		
/*		longnames=	names.stream().filter(str->str.length()>4&&str.length()<8).collect(Collectors.toList());
		System.out.println(longnames);
*/
		names.stream().filter(str->str.length()>4).forEach(str->System.out.println(str));
	}

}
