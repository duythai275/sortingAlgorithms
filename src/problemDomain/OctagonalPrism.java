package problemDomain;

/**
 * This class is represent for Octagonal Prism
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class OctagonalPrism extends Sharp {
	/**
	 * Lenth is an attribute of Octagonal Prism
	 */
	private double length;

	/**
	 * Constructor of OctagonalPrism with Height and Length attributes
	 * 
	 * @param height double value of Height
	 * @param length double value of Length
	 */
	public OctagonalPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	/**
	 * @return double value is base area of Octagonal Prism
	 */
	public double getBaseArea() {
		return ( 2 * ( 1 + Math.sqrt(2) ) * ( this.length * this.length ) );
	}
	
	/**
	 * @return double value is volume of Octagonal Prism
	 */
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
