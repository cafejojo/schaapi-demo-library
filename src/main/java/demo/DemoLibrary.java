package demo;

public class DemoLibrary { 
	public String neverEmptyString() { return "asdf"; }
	public char alwaysBChar() { return 'b'; }
	public int alwaysPositiveInt() { return 10; }
	public double alwaysPositiveDouble() { return 100.0; }
	public boolean alwaysTrueBoolean() { return true; }
	
	public static void checkStringNotEmpty(String s) { if (s.isEmpty()) throw new RuntimeException(); }
	public static void checkCharIsB(char c) { if (c != 'b') throw new RuntimeException(); }
	public static void checkIntIsPositive(int i) { if (i < 0) throw new RuntimeException(); }
	public static void checkDoubleIsPositive(double d) { if (d < 0) throw new RuntimeException(); }
	public static void checkBooleanIsTrue(boolean b) { if (!b) throw new RuntimeException(); }
}
