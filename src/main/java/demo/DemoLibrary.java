package demo;

public final class LibraryClass {
  private boolean initalized = false;
  private int initValue = 10;
  
  public void initialize() {
    initalized = true;
  }
  
  public int foo() {
    return initValue;
  }
  
  public double bar(int x) {
    int divisor = x;
    if (!initalized) {
      divisor = x - initValue;
    }
    
    return 100.0 / divisor;
  }
}
