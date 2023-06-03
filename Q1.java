package collection;
import java.util.*;
public class Q1 {
		public static void main(String[] args) {
			ArrayList<Integer> ls=new ArrayList();
			ls.add(78);
			ls.add(67);
			ls.add(3);
			ls.add(99);
			ls.add(4);
			ls.add(9);
			ls.add(78);
			Collections.sort(ls);
			System.out.println(ls);
			ArrayList<String>l=new ArrayList();
			l.add("jk");
			l.add("op");
			l.add("ll");
			Collections.sort(l);
			System.out.println(l);
		}
}
