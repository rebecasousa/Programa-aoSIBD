public class Circulo extends Quadrilateros {
  public Circulo(double r) {
    super(r, 0.0, 0.0, 0.0);
  }

  public double getR() {
    return super.getA();
  }

  public double area() {
    return Math.PI * Math.pow(getR(), 2.0);
  }

  public double perimetro() {
    return 2.0 * Math.PI * getR();
  }
}