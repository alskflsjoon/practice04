package prob5;

public class RectTriangle extends Shape{

	double width;
	double height;
	
	public RectTriangle(double width, double height){
		super(3);
		this.width=width;
		this.height=height;
	}
	
	@Override
	double getArea() {
		return (this.width*this.height)/2;
	}

	@Override
	double getPerimeter() {
		return Math.sqrt(Math.pow(height, 2)+Math.pow(width, 2))+this.height+this.width;
	}

}
