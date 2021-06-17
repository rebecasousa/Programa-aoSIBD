public class Quadrado extends Quadrilateros {
  public Quadrado(double a) {
    super(a, 0.0, 0.0, 0.0);
  }

  public double getA() {
    return super.getA();
  }

  public double area() {
    return Math.pow(getA(), 2.0);
  }

  public double perimetro() {
    return 4.0 * getA();
  }
}