package problemDomain;

/**
 * This class is represent for Triangular Prism
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class TriangularPrism extends Sharp {
	/**
	 * Length is an attribute of Triangular Prism
	 */
	private double length;

	/**
	 * Constructor of TriangularPrism with Height and Length attributes
	 * 
	 * @param height double value of Height
	 * @param length double value of Length
	 */
	public TriangularPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	
	/**
	 * @return double value is base area of Triangular Prism
	 */
	public double getBaseArea() {
		return ( this.length * this.length * Math.sqrt(3) ) / 4;
	}
	
	/**
	 * @return double value is volume of Triangular Prism
	 */
	public double getVolume() {
		return ( this.getBaseArea() * this.getHeight() );
	}
}
