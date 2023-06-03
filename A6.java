package collection;
import java.util.*;
public class A6 {
			public static void main(String[] args) {
				HashMap hm=new HashMap();
				hm.put(1,12);
				hm.put(5,87);
				hm.put(3, 98.0);
				hm.put(7, 34);
				hm.put(2, "kj");
				hm.put(4,23);
				hm.put(9, 12);
				System.out.println(hm.get(5));
			//	hm.put(null, null);
			//	hm.put(null, 98);
				System.out.println(hm);
				TreeMap tm=new TreeMap(hm);
				tm.put(6, 90);
				tm.put(4, 23);
				tm.put(2, 56.0);
				tm.put(6, 89);
				tm.put(2, "deva");
				System.out.println(tm);
			}
}
