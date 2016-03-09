package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(5.0,6.0);
		Shape s2 = new RectTriangle(6.0,2.0);
		Shape[] shapeArray = {s1,s2};
		
		for(int i=0;i<2;i++){
			System.out.println("area: "+shapeArray[i].getArea());
			System.out.println("perimeter: "+shapeArray[i].getPerimeter());
			
			if(shapeArray[i] instanceof Resizable){
				((Resizable)shapeArray[i]).resize(0.5);
				System.out.println("new area: "+shapeArray[i].getArea());
				System.out.println("new perimeter: "+shapeArray[i].getPerimeter());

			}
		}
		
	}

}
