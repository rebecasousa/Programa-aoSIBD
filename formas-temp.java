public class formas extends Quadrilateros {
  public formas(double a) {
    super(a, 0.0, 0.0, 0.0);
  }

  public double getA() {
    return super.getA();
  }

  public double area() {
    return Math.pow(getA(), 2.0);
  }

  public double perimeter() {
    return 4.0 * getA();
  }
}
