package problemDomain;

public class PentagonalPrism extends Sharp {
	private double length;

	public PentagonalPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	public double getBaseArea() {
		return ( 5 * this.length * this.length * Math.tan(Math.toRadians(54)) ) / 4;
	}
	
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
