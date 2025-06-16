package shapes;

public class Rectangle extends Shape {
	double length, breadth;
	
	public Rectangle() {
		shapeType = "Rectangle";
	}
	
	public Rectangle(String shapeType, String shapeID) {
		super(shapeType, shapeID);
	}

	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter Length: ");
		length = in.nextDouble();
		System.out.println("Enter Width: ");
		breadth = in.nextDouble();
		CalculateArea();
	}

	@Override
	public void CalculateArea() {
		SurfaceArea = length * breadth;
	}

	@Override
	public String toCSVString() {
		return String.format("%s, %s, %f, %f, %f", 
				shapeType, shapeID, SurfaceArea, length, breadth); 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
