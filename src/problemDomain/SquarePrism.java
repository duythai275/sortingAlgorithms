package problemDomain;

/**
 * This class is represent for Square Prism
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class SquarePrism extends Sharp {
	/**
	 * Length is an attribute of Square Prism
	 */
	private double length;

	/**
	 * Constructor of SquarePrism with Height and Length attributes
	 * 
	 * @param height double value of Height
	 * @param length double value of Length
	 */
	public SquarePrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	/**
	 * @return double value is base area of Square Prism
	 */
	public double getBaseArea() {
		return ( this.length * this.length );
	}
	
	/**
	 * @return double value is volume of Square Prism
	 */
	public double getVolume() {
		return ( getBaseArea() * this.getHeight() );
	}
}
