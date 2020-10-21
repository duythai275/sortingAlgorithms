package problemDomain;

public class OctagonalPrism extends Sharp {
	private double length;

	public OctagonalPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	public double getBaseArea() {
		return ( 2 * ( 1 + Math.sqrt(2) ) * ( this.length * this.length ) );
	}
	
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
