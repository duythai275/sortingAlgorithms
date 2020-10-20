package application;

import Management.SharpManagement;

public class appDrive {

	public static void main(String[] args) {
		String type = null;
		String sort = null;
		String file = null;
	
		for ( String arg : args ) {
			if ( arg.startsWith("-f") || arg.startsWith("-F") ) {
				file = arg.replace(arg.substring(0, 2), "");
			} else if ( arg.startsWith("-s") || arg.startsWith("-S") ) {
				sort = arg.replace(arg.substring(0, 2), "");
			} else if ( arg.startsWith("-t") || arg.startsWith("-T") ) {
				type = arg.replace(arg.substring(0, 2), "");
			}
		}
		
		
		SharpManagement sm = new SharpManagement(file, sort, type);
		sm.printResult();
		
	}

}
