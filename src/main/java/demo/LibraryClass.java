package demo;

public final class LibraryClass {
  private boolean initialized = false;
  private int initValue = 10;

  public void initialized() {
    initialized = true;
  }
  
  public int foo() {
    return initValue;
  }

  public double bar(int x) {
    int divisor = x;
    if (!initialized) {
      divisor = x - initValue;
    }

    return 100.0 / divisor;
  }
}
