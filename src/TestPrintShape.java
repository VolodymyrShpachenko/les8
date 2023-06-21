public class TestPrintShape {
    public static void main(String[] args) {
        PrinterShapeName printer = new PrinterShapeName();
        Circle c1 = new Circle();
        Pentagon p1 = new Pentagon();
        printer.printer(c1);
        printer.printer(p1);
    }
}
