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