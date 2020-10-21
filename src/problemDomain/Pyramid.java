package problemDomain;

public class Pyramid extends Sharp {
	private double length;

	public Pyramid(double height, double length) {
		super(height);
		this.length = length;
	}
	
	public double getBaseArea() {
		return ( this.length * this.length );
	}
	
	public double getVolume() {
		return ( getBaseArea() * this.getHeight() ) / 3;
	}
}
