package collection;
import java.util.*;
public class Q4 {
			public static void main(String[] args) {
				LinkedList ls=new LinkedList();
				
				ls.add(new Q3("deva",1,56.8));
				ls.add(new Q3("naveen",2,67.9));
				ls.add(new Q3("hendry",3,98.0));
				
				/*Object o=ls.get(2);
				Q3 l=(Q3)o;
				System.out.println(l.marks);*/
				for(Object i:ls) {
					
					Object ref=ls.get(1);
					Q3 ref2=(Q3)ref;
					if(ref2.marks>80) {
						System.out.println(ref2.name);
					}
				
				}
			}
}
