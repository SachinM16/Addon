package shapes;

public class Circle extends Shape{
	
	double radius;
	
	public Circle() {
		shapeType = "Circle";
	}
	
	public Circle(String shapeType, String shapeID) {
		super(shapeType, shapeID);
	}

	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter Radius: ");
		radius = in.nextDouble();
		CalculateArea();
	}

	@Override
	public void CalculateArea() {
		SurfaceArea = Math.PI * radius * radius;
		// System.out.println(SurfaceArea);
	}

	@Override
	public String toCSVString() {
		return String.format("%s, %s, %f, %f", shapeType, shapeID, SurfaceArea, radius);
	}

	@Override
	public String toString() {
		String out = String.format("%-10s  %-10s  %10.2f  Radius: %-10.2f", shapeType, shapeID, SurfaceArea, radius);   
		return out;
	}
	
	@Override
	public void deserialize(String csv) {
		super.deserialize(csv);
		String tokens[] = csv.split(",");
		radius = Double.parseDouble(tokens[3]);
		tokens = null;
	}
	
	
	
	
	
	
	

}
