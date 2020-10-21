package problemDomain;

public class TriangularPrism extends Sharp {
	private double length;

	public TriangularPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	public double getBaseArea() {
		return ( this.length * this.length * Math.sqrt(3) ) / 4;
	}
	
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
