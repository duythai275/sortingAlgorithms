package problemDomain;

/**
 * This class is super class of all kind of sharps
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public abstract class Sharp implements Comparable<Sharp> {
	/**
	 * Height attribute
	 */
	private double height;

	/**
	 * Constructor with Height attribute
	 * @param height double value of Height
	 */
	public Sharp(double height) {
		super();
		this.height = height;
	}
	
	/**
	 * Get value of Height attribute of a Sharp
	 * @return double value of Height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Compare the height of this Sharp with another Sharp
	 * 
	 * @return a negative integer if this object is greater than that,
	 * or zero if this object is equal to that,
	 * or a positive integer if this object is less than that. 
	 */
	@Override
	public int compareTo(Sharp that) {
		if( this.height > that.height )
		{
			return -1;
		}
		else if( this.height < that.height )
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * A abstract method For specified sharps calculate its base area
	 * @return double value of base area
	 */
	public abstract double getBaseArea();
	
	/**
	 * A abstract method For specified sharps calculate its volume
	 * @return double value of volume
	 */
	public abstract double getVolume();
}
