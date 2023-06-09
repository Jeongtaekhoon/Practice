package collectionProject;

public class Ractangle extends Shape {
	
	int w,h;
	Ractangle(){
		this(1,1);
	}
	
	Ractangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	@Override
	double area() {
		return w * h;
	}

}
