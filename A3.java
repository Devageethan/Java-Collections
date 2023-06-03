package collection;
import java.util.*;
public class A3 {
	//conversion of arralist into treeset
				public static void main(String[] args) {
					ArrayList al=new ArrayList();
					al.add(565);
					al.add(2348);
					al.add(987);
					//al.add(null);
					//al.add(null);
					System.out.println(al);
					TreeSet ts=new TreeSet(al);
					System.out.println(ts);
					ts.add(87);
					ts.add(96);
					System.out.println(ts);
				}
}
