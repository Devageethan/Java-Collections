package collection;

import java.util.ArrayList;
import java.util.List;

public class Emp {
		public static void main(String[] args) {
			List ls=new ArrayList();
			ls.add(new Get("deva",13));
			ls.add(new Get("naveen",22));
			System.out.println(ls);
			System.out.println(ls.get(0));
			Object ref=ls.get(1);
			Get b=(Get)ref;
			System.out.println(b.name);
			
		}
}
