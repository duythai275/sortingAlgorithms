package problemDomain;

/**
 * This class is represent for Cone sharp
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class Cone extends Sharp {
	/**
	 * Radius is an attribute of Cone
	 */
	private double radius;

	/**
	 * Constructor of Cone with Height and Radius attributes
	 * 
	 * @param height double value of Height
	 * @param radius double value of Radius
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	/**
	 * @return double value is base area of Cone
	 */
	public double getBaseArea() {
		return ( this.radius * this.radius * Math.PI );
	}
	
	/**
	 * @return double value is volume of Cone
	 */
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() ) / 3;
	}
}
