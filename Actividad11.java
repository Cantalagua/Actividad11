package actividad11;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
interface Polygon {

    void getArea(int l, int b, int r);

    void getPerimeter(int l, int b, int r);
}

class Triangle implements Polygon {

    @Override
    public void getArea(int l, int b, int r) {
        System.out.println("El área del triángulo es: " + ((l * b) / 2));
    }

    @Override
    public void getPerimeter(int l, int b, int r) {
        System.out.println("El perímetro del triángulo es: " + (3 * l));
    }
}

class Square implements Polygon {

    @Override
    public void getArea(int l, int b, int r) {
        System.out.println("El área del rectángulo es: " + (l * l));
    }

    @Override
    public void getPerimeter(int l, int b, int r) {
        System.out.println("El perímetro del rectángulo es: " + (4 * l));
    }
}

class Circle implements Polygon {

    double pi = 3.14;

    @Override
    public void getArea(int l, int b, int r) {

        System.out.println("El área del círculo es: " + (pi * r * r));
    }

    @Override
    public void getPerimeter(int l, int b, int r) {
        System.out.println("El perímetro del círculo es: " + (2 * pi * r));
    }
}

public class Actividad11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle t = new Triangle();

        Circle c = new Circle();

        Square s = new Square();

        System.out.println("¡Hola! ¿Qué cálculo quieres realizar? \n 1) Area \n 2)Perimetro");
        String elec = input.nextLine();

        if (elec.equalsIgnoreCase("Area")) {
            System.out.println("¿De qué figura deseas calcular? \n1)Cuadrado\n2)Triángulo\n3)Círculo");
            elec = input.nextLine();

            if (elec.equalsIgnoreCase("Cuadrado")) {

                System.out.println("Ingresa el valor del lado de tu cuadrado:");
                int l = Integer.parseInt(input.nextLine());
                s.getArea(l, 0, 0);
            } else if (elec.equalsIgnoreCase("Triangulo")) {
                System.out.println("Ingresa el valor de la base de tu triángulo:");
                int b = Integer.parseInt(input.nextLine());

                System.out.println("Ingresa el valor de la altura de tu triángulo:");
                int h = Integer.parseInt(input.nextLine());
                t.getArea(b, h, 0);
            } else if (elec.equalsIgnoreCase("Circulo")) {
                System.out.println("Ingresa el valor del radio de tu círculo:");
                int r = Integer.parseInt(input.nextLine());
                c.getArea(0, 0, r);
            }
        } else if (elec.equalsIgnoreCase("Perimetro")) {
            System.out.println("¿De qué figura deseas calcular? \n1)Cuadrado\n2)Triángulo\n3)Círculo");
            elec = input.nextLine();

            if (elec.equalsIgnoreCase("Cuadrado")) {
                System.out.println("Ingresa el valor del lado de tu cuadrado:");
                int l = Integer.parseInt(input.nextLine());
                s.getPerimeter(l, 0, 0);
            } else if (elec.equalsIgnoreCase("Triangulo")) {
                System.out.println("Ingresa el valor de la base de tu triángulo:");
                int b = Integer.parseInt(input.nextLine());
                t.getPerimeter(b, 0, 0);
            } else if (elec.equalsIgnoreCase("Circulo")) {
                System.out.println("Ingresa el valor del radio de tu círculo:");
                int r = Integer.parseInt(input.nextLine());
                c.getPerimeter(0, 0, r);
            }
        }
    }

}
