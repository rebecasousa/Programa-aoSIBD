public abstract class Quadrilateros implements Formas {
  private double a;
  private double b;
  private double c;
  private double d;

  public Quadrilateros(double a, double b, double c, double d) {
    this.a = validate(a);
    this.b = validate(b);
    this.c = validate(c);
    this.d = validate(d);
  }

  protected double getA() {
    return a;
  }

  protected double getB() {
    return b;
  }

  protected double getC() {
    return c;
  }

  protected double getD() {
    return d;
  }

  private double validate(double value) {
    if (value >= 0) {
      return value;
    }

    throw new IllegalArgumentException();
  }
}