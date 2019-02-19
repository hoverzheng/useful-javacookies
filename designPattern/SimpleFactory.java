/**
 * simple factory pattern
 */

public class SimpleFactory {
    public static void main(String args[]) {
        Shape s1 = Shape.createShape("A");
        Shape s2 = Shape.createShape("B");

        s1.draw();
        s2.draw();
    }
}


abstract class Shape {
    // public class for create shape
    public static Shape createShape(String shapeName) {
        if (shapeName.equals("A")) {
            return new Rectangle();
        } else if (shapeName.equals("B")) {
            return new Triangle();
        } else {
            return null;
        }
    }

    // subclass to implements methods
    public abstract void draw();
    public abstract void erase();
}


class Rectangle extends Shape {
    // implements draw method
    public void draw() {
        System.out.println("draw rectangle!");
    }

    public void erase() {
        System.out.println("erase rectangle!");
    }
}


class Triangle extends Shape {
    // implements draw method
    public void draw() {
        System.out.println("draw triangle!");
    }

    public void erase() {
        System.out.println("erase triangle!");
    }
}

