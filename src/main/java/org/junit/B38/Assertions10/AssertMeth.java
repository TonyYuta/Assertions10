package org.junit.B38.Assertions10;

/**
 * 10 assertions
 *
 */
public class AssertMeth {
	
    static int i = 10;
    static int j = 15;
    static String sa = "test string a";
    static String sb = "test string b";  
    static boolean boolA;
    static boolean boolB = true;
    static boolean boolC;
    static byte byteA = 5;
    static byte byteB = 8;
    
    public static void main(String[] args) {
      System.out.println("all variables' values:\n" + i + '\n' + j + '\n' + sa + '\n' + sb + '\n' + boolA + '\n' + boolB + '\n' + byteA + '\n' + byteB);   
    }
    
    public int sumInt() {
    	int sum = i + j;
    	return sum;
    }
    
    public byte sumByte() {
    	byte sum = (byte) (byteA + byteB);
    	return sum;
    }
    
    public boolean logicAND() {
    	boolean lAnd = boolA && boolB && boolC;
    	return lAnd;
    }
    
    public boolean logicOR() {
    	boolean lOr = boolA || boolB || boolC;
    	return lOr;
    }
    
    public String concantenateAllVariables() {
    	String concAll = sa + sb + i + j + boolA + boolB + boolC + byteA + byteB;
    	return concAll;
    }
}
