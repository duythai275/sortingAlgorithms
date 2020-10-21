package problemDomain;

public abstract class Sharp implements Comparable<Sharp> {
	private double height;

	public Sharp(double height) {
		super();
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

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
	
	public abstract double getBaseArea();
	
	public abstract double getVolume();
}
