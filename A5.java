package collection;
import java.util.*;
import java.util.Iterator;
public class A5 {
				public static void main(String[] args) {
					HashSet hs=new HashSet();
					hs.add("man");
					hs.add(876);
					hs.add(908);
					hs.add(null);
					hs.add(null);
					System.out.println(hs);
					for(Object o:hs) {
						System.out.println(o);
						System.out.println(o);
					}
					Iterator i=hs.iterator();
					while(i.hasNext()) {
						System.out.println(i.next());
					}
			
					ArrayList al=new ArrayList(hs);
					System.out.println(al);
					al.add(89.9);
					al.add("deva");
					al.add(0,34);
					System.out.println(al);
					ListIterator ls=al.listIterator();
					while(ls.hasNext()) {
						System.out.println(ls.next());
					}
					while(ls.hasPrevious()) {
						System.out.println(ls.previous());
					}
				}
}
