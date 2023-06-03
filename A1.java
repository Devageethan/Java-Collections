package collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class A1 {
			public static void main(String[] args) {
				ArrayList ls=new ArrayList();
				ls.add(12);
				ls.add(333);
				ls.add("deva");
				ls.add(true);
				ls.add('j');
				System.out.println(ls);
				ListIterator l=ls.listIterator();
				while(l.hasNext()) {
					System.out.println(l.next());
				}
				System.out.println("***************");
				while(l.hasPrevious()) {
					System.out.println(l.previous());
				}
				 
			}
}
