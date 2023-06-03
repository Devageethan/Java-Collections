package collection;
import java.util.*;
import java.util.Iterator;
public class A2 {
				public static void main(String[] args) {
					List al=new ArrayList();
					al.add("deva");
					al.add(12);
					al.add(1.23);
					al.add('a');
					System.out.println(al);
					System.out.println(al.get(2));
					for(Object o:al) {
						System.out.println(o);
						
					}
					Iterator i=al.iterator();
					System.out.println(i);
					System.out.println(i.hasNext());
					while(i.hasNext()) {
						System.out.println(i.next());
					}
					ListIterator ls=al.listIterator();
					System.out.println(ls);
					while(ls.hasNext()) {
						System.out.println(ls.next());
					}
					while(ls.hasPrevious()) {
						System.out.println(ls.previous());
					}
				}
}
