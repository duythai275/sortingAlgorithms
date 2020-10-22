package problemDomain;

/**
 * This class is represent for Cylinder
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class Cylinder extends Sharp {
	/**
	 * Radius is an attribute of Cylinder
	 */
	private double radius;

	/**
	 * Constructor of Cylinder with Height and Radius attributes
	 * 
	 * @param height double value of Height
	 * @param radius double value of Radius
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	/**
	 * @return double value is base area of Cylinder
	 */
	public double getBaseArea() {
		return ( this.radius * this.radius * Math.PI );
	}
	
	/**
	 * @return double value is volume of Cylinder
	 */
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
