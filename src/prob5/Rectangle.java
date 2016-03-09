package prob5;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	
	public Rectangle(double width, double height){
		super(4);
		this.width=width;
		this.height=height;
	}
	
	
	@Override
	double getArea() {
		return this.width*this.height;
	}

	@Override
	double getPerimeter() {
		return 2*(this.width+this.height);
	}
	
	@Override
	public void resize(double rate){
		this.width*=rate;
		this.height*=rate;
	}

}
