import java.util.ArrayList;

import java.util.List;

public class Principal {

  public static void main(String[] args) {

  Formas fg1 = new Retangulo(3, 4);

  Formas fg2 = new Circulo(5);

  List<Formas> lista = new ArrayList<Formas>();

  lista.add(fg1);

  lista.add(fg2);

  for (Formas fg : lista) {

  System.out.println("Área da figura: " + fg.area());

  System.out.println("Perímetro da figura: " + fg.perimetro());

  }

  }

}