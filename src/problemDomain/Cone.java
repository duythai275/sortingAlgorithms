package problemDomain;

public class Cone extends Sharp {
	private double radius;

	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public double getBaseArea() {
		return ( this.radius * this.radius * Math.PI );
	}
	
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() ) / 3;
	}
}
