package satish;

abstract class Figure {
	public abstract double calculation();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculation() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculation() {
        return Math.PI * radius * radius;
    }
}

public class Shape {
    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(10.0, 3.0);
        Circle circle = new Circle(3.0);

        System.out.println("Area of Rectangle: " + rectangle.calculation());
        System.out.println("Area of Circle: " + circle.calculation());
    }

	public double calculation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
