package javalabcard1;

public class PrimitiveTypes2 {
            public static void main(String[] args) {
	        // Declaration and initialization of primitive data types
	        
	        // byte
	        byte byteValue = 10;
	        System.out.println("byteValue: " + byteValue);
	        
	        // short
	        short shortValue = 1000;
	        System.out.println("shortValue: " + shortValue);
	        
	        // int
	        int intValue = 100000;
	        System.out.println("intValue: " + intValue);
	        
	        // long
	        long longValue = 1000000000L;
	        System.out.println("longValue: " + longValue);
	        
	        // float
	        float floatValue = 3.14f;
	        System.out.println("floatValue: " + floatValue);
	        
	        // double
	        double doubleValue = 3.14159;
	        System.out.println("doubleValue: " + doubleValue);
	        
	        // char
	        char charValue = 'A';
	        System.out.println("charValue: " + charValue);
	        
	        // boolean
	        boolean booleanValue = true;
	        System.out.println("booleanValue: " + booleanValue);
	        
	        // Implicit type casting
	        
	        // int to long
	        long implicitLong = intValue;
	        System.out.println("implicitLong: " + implicitLong);
	        
	        // float to double
	        double implicitDouble = floatValue;
	        System.out.println("implicitDouble: " + implicitDouble);
	        
	        // explicit type casting
	        
	        // long to int
	        int explicitInt = (int) longValue;
	        System.out.println("explicitInt: " + explicitInt);
	        
	        // double to int
	        int explicitIntFromDouble = (int) doubleValue;
	        System.out.println("explicitIntFromDouble: " + explicitIntFromDouble);
	        
	        // char to int
	        int explicitIntFromChar = (int) charValue;
	        System.out.println("explicitIntFromChar: " + explicitIntFromChar);
	        
	        // int to char
	        char explicitCharFromInt = (char) intValue;
	        System.out.println("explicitCharFromInt: " + explicitCharFromInt);
	    }
	}