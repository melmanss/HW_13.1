public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Square(2)
        };

        double totalArea = ShapeAreaCalculator.totalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }
}
