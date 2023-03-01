package oops;

class Shape   //Base class
{
	public void area() {
		System.out.println("displays  Area");
	}
}	
 class Triangle extends Shape           //Drived Class
 {
	 public void area(int l,int h) {
		 System.out.println(1/2*l*h);
	 }
	 
 }
	public class Single_Inheritance {

	public static void main(String[] args) {
			Triangle t1=new Triangle();
			t1.area();

	}

}
