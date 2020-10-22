package application;

import Management.SharpManagement;

/**
 * This program is to sort Sharps by height, base area or volume
 * 
 * @author Thai Nguyen
 * @version Oct 20, 2020
 */
public class appDrive {
	
	/**
	 * Entry point to Java application.
	 * @param args an array of strings which stores arguments passed by command line while starting a program
	 */
	public static void main(String[] args) {
		
		/**
		 * Variable for receiving Type parameter from argument
		 */
		String type = null;
		
		/**
		 * Variable for receiving Sort parameter from argument
		 */
		String sort = null;
		
		/**
		 * Variable for receiving Filename parameter from argument
		 */
		String file = null;
	
		// Assign value for parameters from argument
		for ( String arg : args ) {
			if ( arg.startsWith("-f") || arg.startsWith("-F") ) {
				file = arg.replace(arg.substring(0, 2), "");
			} else if ( arg.startsWith("-s") || arg.startsWith("-S") ) {
				sort = arg.replace(arg.substring(0, 2), "");
			} else if ( arg.startsWith("-t") || arg.startsWith("-T") ) {
				type = arg.replace(arg.substring(0, 2), "");
			}
		}
		
		// Invoke Management object with parameters
		SharpManagement sm = new SharpManagement(file, sort, type);
		
		// Print sorting result
		sm.printResult();
		
	}

}
