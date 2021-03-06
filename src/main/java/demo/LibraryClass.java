package demo;

public final class LibraryClass {
  private boolean initialized = false;
  private int initValue = 10;

  public int foo() {
    initialized = true;
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
