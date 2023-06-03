package collection;
import java.util.ArrayList;
import java.util.List;

public class Iterator {
			public static void main(String[] args) {
				List ls=new ArrayList();
				ls.add(12);
				ls.add(444);
				ls.add(true);
				ls.add("levi");
				System.out.println(ls.size());
				System.out.println(ls.isEmpty());
				System.out.println(ls.hashCode());
				System.out.println(ls.equals(ls));
			    java.util.Iterator d=ls.iterator();
				/*System.out.println(d.next());
				System.out.println(d.next());
				System.out.println(d.next());
				System.out.println(d.next());
				System.out.println(d.next());*/
			    while(d.hasNext()) {
			    	//ls.add(21);
			    	System.out.println(d.next());
			    }
				
			}
}
