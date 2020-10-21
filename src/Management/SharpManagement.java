package Management;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import problemDomain.*;
import utilities.*;

public class SharpManagement {
	private String file;
	private String sort;
	private String type;
	private Sharp sharpArray[];
	private long timing;
	
	public SharpManagement(String file, String sort, String type) {
		super();
		this.file = file;
		this.sort = sort;
		this.type = type;
		
		this.timing = 0;
		
		readFile();
		sort();
	}
	
	private void readFile() {
		try {
			BufferedReader br = new BufferedReader( new FileReader("res/"+this.file));
			String line = br.readLine();
			while ( line != null ) {
				loadSharps(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadSharps(String line) {
		String[] sharps = line.split(" ");
		sharpArray = new Sharp[Integer.parseInt(sharps[0])];
		for ( int i = 1; i < sharps.length; i += 3 ) {
			String className = sharps[i];
			if ( className.equals("Cylinder") ) {
				sharpArray[ (i - 1) / 3 ] = new Cylinder(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("Cone") ) {
				sharpArray[ (i - 1) / 3 ] = new Cone(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("Pyramid") ) {
				sharpArray[ (i - 1) / 3 ] = new Pyramid(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("PentagonalPrism") ) {
				sharpArray[ (i - 1) / 3 ] = new PentagonalPrism(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("OctagonalPrism") ) {
				sharpArray[ (i - 1) / 3 ] = new OctagonalPrism(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("TriangularPrism") ) {
				sharpArray[ (i - 1) / 3 ] = new TriangularPrism(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			} else if ( className.equals("SquarePrism") ) {
				sharpArray[ (i - 1) / 3 ] = new SquarePrism(Double.parseDouble(sharps[i+1]),Double.parseDouble(sharps[i+2]));
			}
		}
	}
	
	private void sort () {

		if ( this.type.toUpperCase().equals("A") ) {
			BaseAreaCompare bc = new BaseAreaCompare();
			if ( this.sort.toUpperCase().equals("B") ) {
				this.timing = BubbleSort.Sort(sharpArray, bc);
			} else if ( this.sort.toUpperCase().equals("S") ) {
				this.timing = SelectionSort.Sort(sharpArray, bc);
			} else if ( this.sort.toUpperCase().equals("I") ) {
				this.timing = InsertionSort.Sort(sharpArray, bc);
			} else if ( this.sort.toUpperCase().equals("M") ) {
				this.timing = MergeSort.Sort(sharpArray, bc);
			} else if ( this.sort.toUpperCase().equals("Q") ) {
				this.timing = QuickSort.Sort(sharpArray, bc);
			} else if ( this.sort.toUpperCase().equals("Z") ) {
				this.timing = ShellSort.Sort(sharpArray, bc);
			}
		} else if ( this.type.toUpperCase().equals("V") ) {
			VolumeCompare vc =  new VolumeCompare();
			if ( this.sort.toUpperCase().equals("B") ) {
				this.timing = BubbleSort.Sort(sharpArray, vc);
			} else if ( this.sort.toUpperCase().equals("S") ) {
				this.timing = SelectionSort.Sort(sharpArray, vc);
			} else if ( this.sort.toUpperCase().equals("I") ) {
				this.timing = InsertionSort.Sort(sharpArray, vc);
			} else if ( this.sort.toUpperCase().equals("M") ) {
				this.timing = MergeSort.Sort(sharpArray, vc);
			} else if ( this.sort.toUpperCase().equals("Q") ) {
				this.timing = QuickSort.Sort(sharpArray, vc);
			} else if ( this.sort.toUpperCase().equals("Z") ) {
				this.timing = ShellSort.Sort(sharpArray, vc);
			}
		} else if ( this.type.toUpperCase().equals("H") ) {
			if ( this.sort.toUpperCase().equals("B") ) {
				this.timing = BubbleSort.Sort(sharpArray);
			} else if ( this.sort.toUpperCase().equals("S") ) {
				this.timing = SelectionSort.Sort(sharpArray);
			} else if ( this.sort.toUpperCase().equals("I") ) {
				this.timing = InsertionSort.Sort(sharpArray);
			} else if ( this.sort.toUpperCase().equals("M") ) {
				this.timing = MergeSort.Sort(sharpArray);
			} else if ( this.sort.toUpperCase().equals("Q") ) {
				this.timing = QuickSort.Sort(sharpArray);
			} else if ( this.sort.toUpperCase().equals("Z") ) {
				this.timing = ShellSort.Sort(sharpArray);
			}
		}
		
	}
	
	public void printResult () {
		for ( Sharp sharp : sharpArray ) {
			if ( this.type.toUpperCase().equals("H") )
				System.out.println(sharp.getHeight());
			else if ( this.type.toUpperCase().equals("A") )
				System.out.println(sharp.getBaseArea());
			else if ( this.type.toUpperCase().equals("V") )
				System.out.println(sharp.getVolume());
		}
		
		System.out.println("This sorting has taken " + this.timing);
		System.out.println("Max Value: " + ( this.type.toUpperCase().equals("H") ? sharpArray[0].getHeight() : this.type.toUpperCase().equals("A") ? sharpArray[0].getBaseArea() : sharpArray[0].getVolume() ) );
		System.out.println("Min Value: " + ( this.type.toUpperCase().equals("H") ? sharpArray[sharpArray.length - 1].getHeight() : this.type.toUpperCase().equals("A") ? sharpArray[sharpArray.length - 1].getBaseArea() : sharpArray[sharpArray.length - 1].getVolume() ));
	}
}
