package shapes;

public class Cube extends Shape{

	double length, breadth, height;
	
	public Cube() {
		shapeType = "Cube";
	}
	
	public Cube(String shapeType, String shapeID) {
		super(shapeType, shapeID);
	}

	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter Length: ");
		length = in.nextDouble();
		System.out.println("Enter Breadth: ");
		breadth = in.nextDouble();
		System.out.println("Enter Height: ");
		height = in.nextDouble();
		CalculateArea();
	}

	@Override
	public void CalculateArea() {
		SurfaceArea = 2 * (length*breadth + breadth*height + length*height);
	}

	@Override
	public String toCSVString() {
		return String.format("%s, %s, %f, %f, %f, %f", shapeType, shapeID, SurfaceArea, length, breadth, height);
	}

	@Override
	public String toString() {
		return null;
	}

}
