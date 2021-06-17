public class Retangulo extends Quadrilateros{
  public Retangulo (double b, double h) {
    super(0.0, b, h, 0.0);
  }

  public double getB() {
    return super.getB();
  }

  public double getH() {
    return super.getC();
  }

  public double area() {
    return getB() * getH();
  }

  public double perimetro() {
    return 2.0 * getB() * getH();
  }
}