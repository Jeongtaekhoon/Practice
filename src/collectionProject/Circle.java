package collectionProject;


public class Circle extends Shape {
	
	double r;
	
	public Circle() {
		this(1);
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(int x, int y) {
		super(x, y);
		
	}

	@Override
	double area() {
		
		return (r*r) * Math.PI;
	}

}
