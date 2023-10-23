/*
	A program to test out jdk21 with code examples.
*/

class Hello {
    public static void main ( String[] args ) {
        // testing out compilation and execution
        System.out.println("Hello World!");

        System.out.println("------Variables-----");

        // testing variables
        String message = "Initial value";
        System.out.println( message );
        message = "Modified value";
        System.out.println( message );

        System.out.println("-----Data Types-----");

        // testing different data types
        char letter = 'M';
		int number = 365;
		float decimal = 98.6f;
		boolean result = true ;

		System.out.println( "Initial is " + letter ) ;			
		System.out.println( "Days are " + number ) ;		
		System.out.println( "Temperature is " + decimal ) ;		
		System.out.println( "Answer is " + result ) ;

        System.out.println("-----Constants-----");

        // testing constant variables
		final int TOUCHDOWN = 6;
		final int CONVERSION = 1;
		final int FIELDGOAL = 3;

		int td, pat, fg, total;
		td  = 4 * TOUCHDOWN;		// 4x6=24
		pat = 3 * CONVERSION;		// 3x1= 3
		fg  = 2 * FIELDGOAL;		// 2x3= 6
		total = ( td + pat + fg );	// 24+3+6=33

		// Output calculated total.
		System.out.println( "Score: " + total );

        System.out.println("-----Escape-----");

        // Escape literals
        String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
		header += "\t---\t\t----\t---\t----------\n";

		String forecast = "\tSunday\t\t68F\t48F\tSunny\n";
		forecast += "\tMonday\t\t69F\t57F\tSunny\n";
		forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";

		System.out.print( header + forecast );
        
        System.out.println("-----Bits/Binary-----");
        // bitwise operations 
        // 0   0   1   1   0   1   0   1 (binary - 53)
        //128  64  32  16  8   4   2   1 (bits of memory)
        byte fs = 53;
   
        System.out.println("1: " + ((fs & 1) > 0) ? "ON" : "off");
        System.out.println("2: " + ((fs & 2) > 0) ? "ON" : "off");
        System.out.println("4: " + ((fs & 4) > 0) ? "ON" : "off");
        System.out.println("8: " + ((fs & 8) > 0) ? "ON" : "off");
        System.out.println("16: " + ((fs & 16) > 0) ? "ON" : "off");
        System.out.println("32: " + ((fs & 32) > 0) ? "ON" : "off");
        System.out.println("64: " + ((fs & 64) > 0) ? "ON" : "off");
        System.out.println("128: " + ((fs & 128) > 0) ? "ON" : "off");
    }
}

