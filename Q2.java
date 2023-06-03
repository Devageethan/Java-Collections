package collection;
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add(12);
		ls.add(23);
		ls.add(6);
		ls.add(90);
		ls.add(66);
		ls.add(12);
		//ls.add(null);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
		System.out.println(ls.get(3));
		System.out.println(ls.isEmpty());
		System.out.println(ls.hashCode());
		System.out.println(ls.equals(ls));
		System.out.println(ls.toArray());
		System.out.println(ls.size());
		System.out.println(ls.containsAll(ls));
		//System.out.println(ls.removeAll(ls));
		System.out.println(ls);
		//System.out.println(ls.retainAll(ls));
		//System.out.println(ls);
		System.out.println(ls.remove(5));
		System.out.println(ls);
		
	}
}
