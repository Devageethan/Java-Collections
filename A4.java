package collection;
import java.util.*;
public class A4 {
				public static void main(String[] args) {
					ArrayList al=new ArrayList();
					al.add("deva");
					al.add("naveen");
					al.add(980);
					al.add(98);
					al.add(34.45);
					al.add(98);
					System.out.println(al);
					HashSet hs=new HashSet(al);
					System.out.println(hs);
					hs.add(23);
					hs.add(657);
					hs.add(null);
					hs.add(null);
					System.out.println(hs);
				}
}
