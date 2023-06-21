public abstract class Shape {
    public abstract void shapeName();
}

class Circle extends Shape{
    @Override
    public void shapeName() {
        System.out.println("Это круг");
    }
}
class Quad extends Shape{
    @Override
    public void shapeName() {
        System.out.println("Это квадрат");
    }
}
class Triangle extends Shape{
    @Override
    public void shapeName() {
        System.out.println("Это треуголик");
    }
}
class Rectangle extends Shape {
    @Override
    public void shapeName() {
        System.out.println("Это прямоугольник");
    }
}
class Pentagon extends Shape{
    @Override
    public void shapeName() {
        System.out.println("Это пятиугольник");
    }
}
class PrinterShapeName{
    public void printer (Shape shape) {
        shape.shapeName();
    }
}

class TestPrintShape {
    public static void main(String[] args) {
        PrinterShapeName printer = new PrinterShapeName();
        Circle c1 = new Circle();
        Pentagon p1 = new Pentagon();
        printer.printer(c1);
        printer.printer(p1);
    }
}