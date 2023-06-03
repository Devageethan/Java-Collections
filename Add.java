package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Add {
	public static void main(String[] args) {
		
			List ls=new ArrayList();
			ls.add(12);
			ls.add(true);
			ls.add(12.3);
			ls.add("deva");
			System.out.println(ls);
			ls.remove(1);
			ls.remove(12.3);
			System.out.println(ls);
			System.out.println(ls.get(0));
			System.out.println(ls.get(1));
			
			
	}
}
class storehc{
	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(10);
		a.add(34);
		a.add("tabbu");
		a.add("sambu");
		
		System.out.println(a);
		
		Set o=new HashSet(a);
		System.out.println(o);
		
		
	}
}
 
class swappingme{
	public static void main(String[] args) {
		int a=10,b=5,temp=a;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=b;
		b=temp;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}


