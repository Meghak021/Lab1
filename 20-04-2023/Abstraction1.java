package lab1;
abstract class Shape{
	
	abstract double CalculateArea();

}
class Circle extends Shape{
	double n;
	public Circle(double n) {
		this.n=n;
		
	}
	
	@Override
	double CalculateArea() {
		double area = 3.14 *n*n;
		return area;
		
		
	}

}

class Rectangle extends Shape{
	double a ,b;
	public Rectangle(double a , double b) {
		this.a=a;
		this.b=b;
	}
	

	@Override
	double CalculateArea() {
		
		double area = a*b;
		return area;
	}
}


public class Abstraction1 {
	public static void main(String[] args) {
		
		Circle x = new Circle(2);
		System.out.println("Area of Circle : " + x.CalculateArea());
		
		Rectangle y= new Rectangle(2,3);
		System.out.println("Area of Rectangle : " + y.CalculateArea());
		

	}

}
