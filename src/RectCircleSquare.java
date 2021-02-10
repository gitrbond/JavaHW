import java.util.Scanner;

public class RectCircleSquare {
    public static void main (String args[]){
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();*/
        Rect r = new Rect(3, 4);
        System.out.printf("Rect Area: %f \n", r.Area());
        Square s = new Square(3.4);
        System.out.printf("Square Area: %f \n", s.Area());
        Circle c = new Circle(2);
        System.out.printf("Circle Area: %f \n", c.Area());
        //System.out.println("I work!");
    }
}

class Rect {
    protected double a, b;

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double Area() {
        return a * b;
    }
}

class Square extends Rect {
    public Square(double a) {
        super(a, a); //конструктор базового класса Rect
    }
}

class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double Area() {
        return Math.PI * r * r;
    }
}