package problemDomain;

public class Cylinder extends Sharp {
	private double radius;

	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public double getBaseArea() {
		return ( this.radius * this.radius * Math.PI );
	}
	
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
