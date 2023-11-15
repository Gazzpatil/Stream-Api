package stream;
import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
public class RemovingNull {

	public static void main(String[] args) {
		List<String> obj=Arrays.asList("tom",null,"pinyi","tommya",null);
		List<String> removenull=new ArrayList<String>();
		removenull=obj.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(removenull);
	}

}
