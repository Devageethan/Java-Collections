package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maxelement {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(22);
	l.add(34);
	l.add(11);
	l.add(1);
	l.add(56);
	int max=(int) Collections.max(l);
	int min=(int) Collections.min(l);
	if(max==min) {
		System.out.println("all are equal");
	}else {
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
	
}
}
