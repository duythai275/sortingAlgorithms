package problemDomain;

/**
 * This class is represent for Pyramid
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class Pyramid extends Sharp {
	/**
	 * Length is an attribute of Pyramid
	 */
	private double length;

	/**
	 * Constructor of Pyramid with Height and Length attributes
	 * 
	 * @param height double value of Height
	 * @param length double value of Length
	 */
	public Pyramid(double height, double length) {
		super(height);
		this.length = length;
	}
	
	/**
	 * @return double value is base area of Pyramid
	 */
	public double getBaseArea() {
		return ( this.length * this.length );
	}
	
	/**
	 * @return double value is volume of Pyramid
	 */
	public double getVolume() {
		return ( getBaseArea() * this.getHeight() ) / 3;
	}
}
