package collection;
import java.util.*;
public class Q5 {
		public static void main(String[] args) {
			LinkedList ls=new LinkedList();
			ls.add(12);
			ls.add(11);
			ls.add(45);
			ls.add(true);
			
			for(Object o:ls) {
				System.out.println(o);
			}
}
		}
