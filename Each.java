package collection;

public class Each {
		String name;
		int id;
		double marks;
		Each(String name,int id,double marks){
			this.name=name;
			this.id=id;
			this.marks=marks;
		}
		@Override
		public String toString() {
			return "Each [name=" + name + ", id=" + id + ", marks=" + marks + "]";
		}
		
		
}

class Laptop{
		//states
		String name;
//		String Storage;
		double price;
		
		Laptop(){
			//LI
		}
		Laptop(String name,double price){
			this.name=name;
			this.price=price;
			}
		@Override
		public String toString() {
			return "name :"+name+" "+"Price"+price;
			}
}