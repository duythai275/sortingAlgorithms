package problemDomain;

/**
 * This class is represent for Pentagonal Prism
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class PentagonalPrism extends Sharp {
	/**
	 * Length is an attribute of Pentagonal Prism
	 */
	private double length;

	/**
	 * Constructor of PentagonalPrism with Height and Length attributes
	 * 
	 * @param height double value of Height
	 * @param length double value of Length
	 */
	public PentagonalPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	/**
	 * @return double value is base area of Pentagonal Prism
	 */
	public double getBaseArea() {
		return ( 5 * this.length * this.length * Math.tan(Math.toRadians(54)) ) / 4;
	}
	
	/**
	 * @return double value is volume of Pentagonal Prism
	 */
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
