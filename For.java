package collection;
import java.util.ArrayList;
import java.util.List;
public class For {
		
			public static void main(String[] args) {
				List ls=new ArrayList();
				ls.add(new Each("deva",1,89));
				ls.add(new Each("moorthy",2,99));
				ls.add(new Each("danny",3,34));
				ls.add(new Each("harbort",4,22));
				ls.add(new Each("john",5,33));
				ls.add(new Each("kenny",6,35));
				
			for (int i=0;i<ls.size();i++) {
				Object ref=ls.get(i);
				Each ref2=(Each)ref;
						if(ref2.marks<35) {
							System.out.println(ref2.name);
						}
					}
					
			}
}
