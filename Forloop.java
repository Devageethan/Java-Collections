package collection;
import java.util.ArrayList;

public class Forloop {
			public static void main(String[] args) {
				ArrayList ls=new ArrayList();
				ls.add(345);
				ls.add(987);
				ls.add("deva");
				ls.add(true);
				ls.add(899);
				for(Object o:ls) {
					System.out.println(o);	
				}
			}
}
