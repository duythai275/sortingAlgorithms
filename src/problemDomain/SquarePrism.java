package problemDomain;

public class SquarePrism extends Sharp {
	private double length;

	public SquarePrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	public double getBaseArea() {
		return ( this.length * this.length );
	}
	
	public double getVolume() {
		return ( getBaseArea() * this.getHeight() );
	}
}
